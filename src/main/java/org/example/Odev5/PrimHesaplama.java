package org.example.Odev5;

public class PrimHesaplama {
    public static double primHesapla(Personel personel) {
        int calistigiGun = personel.calistigiGunSayisi;
        double prim = (calistigiGun > 25) ? (calistigiGun - 25) * 1000 : 0;
        return prim;
    }
}
