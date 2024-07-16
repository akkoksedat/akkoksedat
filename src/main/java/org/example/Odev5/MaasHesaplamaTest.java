package org.example.Odev5;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MaasHesaplamaTest {

    private Personel personel1;
    private Personel personel2;

    @BeforeClass
    public void setUpBeforeClass() {
        personel1 = new Personel("Ahmet", 27);
        personel2 = new Personel("Ayşe", 20);
    }

    @BeforeMethod
    public void setUpBeforeMethod() {
    }

    @Test
    public void testMaasHesapla() {
        double maas1 = MaasHesaplama.maasHesapla(personel1);
        double maas2 = MaasHesaplama.maasHesapla(personel2);

        Assert.assertEquals(maas1, 7000.0, "Ahmet'in maaşı doğru hesaplanmadı");
        Assert.assertEquals(maas2, 5000.0, "Ayşe'nin maaşı doğru hesaplanmadı");
    }
}
