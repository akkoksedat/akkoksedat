package org.example.Ders11;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Person takimLideri;
    private List<Person> personelListesi;
    private List<String> gorevListesi;

    public Department(Person takimLideri) {
        this.takimLideri = takimLideri;
        this.personelListesi = new ArrayList<>();
        this.gorevListesi = new ArrayList<>();
    }

    public void takimLideriDegistir(Person yeniLider) {
        this.takimLideri = yeniLider;
    }

    public void personelEkle(Person personel) {
        personelListesi.add(personel);
    }

    public void personelCikar(Person personel) {
        personelListesi.remove(personel);
    }

    public void personelDegistir(int index, Person yeniPersonel) {
        personelListesi.set(index, yeniPersonel);
    }

    public void gorevEkle(String gorev) {
        gorevListesi.add(gorev);
    }

    public void goreviTamamlandiOlarakIsaretle(int index) {
        String gorev = gorevListesi.get(index);
        gorevListesi.set(index, gorev + " (Tamamlandı)");
    }

    // Getter ve Setter metodları
    public Person getTakimLideri() {
        return takimLideri;
    }

    public void setTakimLideri(Person takimLideri) {
        this.takimLideri = takimLideri;
    }

    public List<Person> getPersonelListesi() {
        return personelListesi;
    }

    public void setPersonelListesi(List<Person> personelListesi) {
        this.personelListesi = personelListesi;
    }

    public List<String> getGorevListesi() {
        return gorevListesi;
    }

    public void setGorevListesi(List<String> gorevListesi) {
        this.gorevListesi = gorevListesi;
    }
}
