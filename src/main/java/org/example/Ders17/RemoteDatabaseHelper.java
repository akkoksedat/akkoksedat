package org.example.Ders17;

import java.sql.*;

public class RemoteDatabaseHelper {
    private static final String URL = "jdbc:mysql://sql8.freemysqlhosting.net:3306/your-database-name";
    private static final String USER = "your-username";
    private static final String PASSWORD = "your-password";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS ad_soyad (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), age INT)";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        createTable();
    }
}
