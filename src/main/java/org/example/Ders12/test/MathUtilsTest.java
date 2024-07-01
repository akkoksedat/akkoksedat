package org.example.Ders12.test;

import org.example.Ders12.exceptions.DivisionByZeroException;
import org.example.Ders12.utilities.MathUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class MathUtilsTest {

    @Test
    public void testDivide_throwsDivisionByZeroException() {
        assertThrows(DivisionByZeroException.class, () -> {
            MathUtils.divide(10, 0);
        });
    }
}
