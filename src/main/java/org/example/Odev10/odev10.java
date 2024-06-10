package org.example.Odev10;

public class odev10 {
        enum Gezegen {
            MERKUR(1, 57.9, 2439.7, 58.6),
            VENUS(2, 108.2, 6051.8, 243.0),
            DUNYA(3, 149.6, 6371.0, 1.0),
            MARS(4, 227.9, 3389.5, 1.03),
            JUPITER(5, 778.3, 69911.0, 0.41),
            SATURN(6, 1427.0, 58232.0, 0.44),
            URANUS(7, 2871.0, 25362.0, 0.72),
            NEPTUN(8, 4497.1, 24622.0, 0.67);

            private final int siralamaNumarasi;
            private final double uzaklik; // Milyon kilometre
            private final double yaricap; // Kilometre
            private final double donmeSuresi; // Dünya günleri cinsinden

            Gezegen(int siralamaNumarasi, double uzaklik, double yaricap, double donmeSuresi) {
                this.siralamaNumarasi = siralamaNumarasi;
                this.uzaklik = uzaklik;
                this.yaricap = yaricap;
                this.donmeSuresi = donmeSuresi;
            }

            public int getSiralamaNumarasi() {
                return siralamaNumarasi;
            }

            public double getUzaklik() {
                return uzaklik;
            }

            public double getYaricap() {
                return yaricap;
            }

            public double getDonmeSuresi() {
                return donmeSuresi;
            }
        }

        public static void main(String[] args) {
            for (Gezegen gezegen : Gezegen.values()) {
                System.out.println("Gezegen: " + gezegen.name());
                System.out.println("Sıralama Numarası: " + gezegen.getSiralamaNumarasi());
                System.out.println("Uzaklık (Milyon km): " + gezegen.getUzaklik());
                System.out.println("Yarıçap (km): " + gezegen.getYaricap());
                System.out.println("Dönme Süresi (Dünya günleri): " + gezegen.getDonmeSuresi());
                System.out.println();
            }
        }
    }
