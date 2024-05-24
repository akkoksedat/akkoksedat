package org.example.Odev5;

public class MaasHesaplama {
    public static double maasHesapla(Personel personel) {
        double maas = 0;
        int calistigiGun = personel.calistigiGunSayisi;

        if (calistigiGun >= 25) {
            maas = 5000 + (calistigiGun - 25) * 1000;
        } else {
            maas = 5000;
        }

        return maas;
    }
}
