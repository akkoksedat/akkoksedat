package org.example.Ders11;

import org.example.Odev4.Person.Person;

import java.time.LocalDate;
import java.time.Period;

public class Male extends Person {
    public Male(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public int emeklilikYasiniHesapla() {
        LocalDate now = LocalDate.now();
        LocalDate dogumTarihi = null;
        int age = Period.between(null, now).getYears();
        return 65 - age;
    }
}
