package org.example.Odev5;

public class Personel {
    String ad;
    int calistigiGunSayisi;

    public Personel(String ad, int calistigiGunSayisi) {
        this.ad = ad;
        this.calistigiGunSayisi = calistigiGunSayisi;
    }

    public int getCalistigiGunSayisi() {
        return calistigiGunSayisi;
    }

    public String getAd() {
        return ad;
    }
}

