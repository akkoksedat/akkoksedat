package org.example.Odev5;

    public class odev5farkli {
        private String ad;
        private int calistigiGunSayisi;
        private static final int GUNLUK_UCRET = 200; // Günlük ücret
        private static final int BONUS_ESIGI = 25;  // Prim eşiği
        private static final int BONUS_MIKTARI = 1000; // Günlük prim miktarı

        public odev5farkli(String ad, int calistigiGunSayisi) {
            this.ad = ad;
            this.calistigiGunSayisi = calistigiGunSayisi;
        }

        // Maaş hesaplama metodu
        public double maasHesapla() {
            double temelMaas = calistigiGunSayisi * GUNLUK_UCRET;
            double prim = primHesapla();
            return temelMaas + prim;
        }

        // Prim hesaplama metodu
        public double primHesapla() {
            return calistigiGunSayisi > BONUS_ESIGI ? (calistigiGunSayisi - BONUS_ESIGI) * BONUS_MIKTARI : 0;
        }

        public String getAd() {
            return ad;
        }

        public int getCalistigiGunSayisi() {
            return calistigiGunSayisi;
        }

        public static void main(String[] args) {
            odev5farkli personel1 = new odev5farkli("Ahmet", 28);
            odev5farkli personel2 = new odev5farkli("Ayşe", 35);

            double maas1 = personel1.maasHesapla();
            double prim1 = personel1.primHesapla();

            double maas2 = personel2.maasHesapla();
            double prim2 = personel2.primHesapla();

            System.out.println(personel1.getAd() + " maaşı: " + maas1 + " TL (Prim: " + prim1 + " TL)");
            System.out.println(personel2.getAd() + " maaşı: " + maas2 + " TL (Prim: " + prim2 + " TL)");
        }
    }

