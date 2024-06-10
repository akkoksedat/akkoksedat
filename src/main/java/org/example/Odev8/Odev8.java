package org.example.Odev8;
import java.util.*;
public class Odev8 {
        public static void main(String[] args) {
            // Adım 1: Kelime dizisini oluşturma
            List<String> kelimeDizisi = Arrays.asList("kalem", "elalem", "kelam", "kelime");

            // Tekrarlı harf içeren kelimeleri bulmak için bir liste oluşturuyoruz
            List<String> tekrarlıHarfliKelimeler = new ArrayList<>();

            // Adım 2: Kelimeleri tekrarlı harf olup olmadığını kontrol etme
            for (String kelime : kelimeDizisi) {
                if (tekrarlıHarfVarMi(kelime)) {
                    tekrarlıHarfliKelimeler.add(kelime);
                    // Adım 3: İki kelime bulunduğunda aramayı kesme
                    if (tekrarlıHarfliKelimeler.size() == 2) {
                        break;
                    }
                }
            }

            // İki kelime bulduysak, harfleriyle rastgele bir metin oluşturacağız
            if (tekrarlıHarfliKelimeler.size() == 2) {
                String kelime1 = tekrarlıHarfliKelimeler.get(0);
                String kelime2 = tekrarlıHarfliKelimeler.get(1);
                String rastgeleMetin = rastgeleMetinOlustur(kelime1, kelime2);
                System.out.println("Tekrarlı harf içeren 2 kelime: " + kelime1 + ", " + kelime2);
                System.out.println("Oluşturulan metin: " + rastgeleMetin);
            } else {
                System.out.println("Tekrarlı harf içeren yeterli kelime bulunamadı.");
            }
        }

        // Kelimenin tekrarlı harf içerip içermediğini kontrol eden metod
        private static boolean tekrarlıHarfVarMi(String kelime) {
            Set<Character> harfSeti = new HashSet<>();
            for (char harf : kelime.toCharArray()) {
                if (harfSeti.contains(harf)) {
                    return true;
                }
                harfSeti.add(harf);
            }
            return false;
        }

        // İki kelimenin harflerinden rastgele bir metin oluşturan metod
        private static String rastgeleMetinOlustur(String kelime1, String kelime2) {
            List<Character> harfler = new ArrayList<>();
            for (char harf : kelime1.toCharArray()) {
                harfler.add(harf);
            }
            for (char harf : kelime2.toCharArray()) {
                harfler.add(harf);
            }

            // Harfleri rastgele karıştırma
            Collections.shuffle(harfler);

            // Karışık harflerden oluşan bir String oluşturma
            StringBuilder sonuc = new StringBuilder();
            for (char harf : harfler) {
                sonuc.append(harf);
            }

            return sonuc.toString();
        }
    }
