package org.example.Odev5;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MaasHesaplamaTest2 {

    @DataProvider(name = "maasVerileri")
    public Object[][] maasVerileri() {
        return new Object[][] {
                { new Personel("Ahmet", 27), 7000.0 },
                { new Personel("Ayşe", 20), 5000.0 },
                { new Personel("Mehmet", 25), 5000.0 },
                { new Personel("Ali", 30), 10000.0 }
        };
    }

    @Test(dataProvider = "maasVerileri")
    public void testMaasHesapla(Personel personel, double beklenenMaas) {
        double maas = MaasHesaplama.maasHesapla(personel);
        Assert.assertEquals(maas, beklenenMaas, personel.getAd() + " için maaş doğru hesaplanmadı");
    }
}
