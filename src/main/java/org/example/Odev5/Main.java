package org.example.Odev5;

public class Main {
    public static void main(String[] args) {
        Personel personel1 = new Personel("Ahmet", 27);
        Personel personel2 = new Personel("Ayşe", 20);

        double maas1 = MaasHesaplama.maasHesapla(personel1);
        double maas2 = MaasHesaplama.maasHesapla(personel2);

        double prim1 = PrimHesaplama.primHesapla(personel1);
        double prim2 = PrimHesaplama.primHesapla(personel2);

        System.out.println(personel1.getAd() + " için maaş: " + maas1 + " TL, prim: " + prim1 + " TL");
        System.out.println(personel2.getAd() + " için maaş: " + maas2 + " TL, prim: " + prim2 + " TL");
    }
}
