package org.example.Ders11;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person lider = new Person("Ali", "Yılmaz", LocalDate.of(1980, 5, 20)) {
            @Override
            public int emeklilikYasiniHesapla() {
                return 0;
            }
        };
        Department department = new Department(lider);

        Person personel1 = new Person("Ayşe", "Kara", LocalDate.of(1990, 3, 15)) {
            @Override
            public int emeklilikYasiniHesapla() {
                return 0;
            }
        };
        Person personel2 = new Person("Mehmet", "Demir", LocalDate.of(1985, 8, 10)) {
            @Override
            public int emeklilikYasiniHesapla() {
                return 0;
            }
        };

        department.personelEkle(personel1);
        department.personelEkle(personel2);

        department.gorevEkle("Proje Planlaması");
        department.gorevEkle("Geliştirme");
        department.gorevEkle("Test");

        System.out.println("Emeklilik Yaşı Hesaplama:");
        System.out.println(personel1.getAd() + " " + personel1.getSoyad() + " için kalan yıl: " + personel1.emeklilikYasiniHesapla());
        System.out.println(personel2.getAd() + " " + personel2.getSoyad() + " için kalan yıl: " + personel2.emeklilikYasiniHesapla());

        System.out.println("\nGörevler:");
        for (String gorev : department.getGorevListesi()) {
            System.out.println(gorev);
        }

        department.goreviTamamlandiOlarakIsaretle(1);

        System.out.println("\nTamamlanmış Görevler:");
        for (String gorev : department.getGorevListesi()) {
            System.out.println(gorev);
        }
    }
}
