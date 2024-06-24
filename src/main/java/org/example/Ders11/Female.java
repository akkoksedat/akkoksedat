package org.example.Ders11;

import org.example.Odev4.Person.Person;

import java.time.LocalDate;
import java.time.Period;

public class Female extends Person {
    public Female(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public int emeklilikYasiniHesapla() {
        LocalDate now = LocalDate.now();
        LocalDate dogumTarihi = null;
        int age = Period.between(null, now).getYears();
        return 60 - age;
    }
}

