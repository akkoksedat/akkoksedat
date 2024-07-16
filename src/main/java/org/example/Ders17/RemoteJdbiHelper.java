package org.example.Ders17;

import org.jdbi.v3.core.Jdbi;

public class RemoteJdbiHelper {
    private static final String URL = "jdbc:mysql://sql8.freemysqlhosting.net:3306/your-database-name";
    private static final String USER = "your-username";
    private static final String PASSWORD = "your-password";

    public static void main(String[] args) {
        Jdbi jdbi = Jdbi.create(URL, USER, PASSWORD);

        jdbi.useHandle(handle -> {
            handle.execute("CREATE TABLE IF NOT EXISTS ad_soyad (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), age INT)");

            handle.execute("INSERT INTO ad_soyad(name, age) VALUES (?, ?)", "Alice", 28);
            handle.execute("INSERT INTO ad_soyad(name, age) VALUES (?, ?)", "Bob", 34);
            handle.execute("INSERT INTO ad_soyad(name, age) VALUES (?, ?)", "Charlie", 22);

            handle.createQuery("SELECT * FROM ad_soyad")
                    .mapToMap()
                    .list()
                    .forEach(row -> System.out.println(row));

            handle.execute("DELETE FROM ad_soyad WHERE name = ?", "Bob");

            System.out.println("After deletion:");
            handle.createQuery("SELECT * FROM ad_soyad")
                    .mapToMap()
                    .list()
                    .forEach(row -> System.out.println(row));
        });
    }
}
