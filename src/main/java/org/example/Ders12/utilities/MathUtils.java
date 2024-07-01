package org.example.Ders12.utilities;

import org.example.Ders12.exceptions.DivisionByZeroException;

public class MathUtils {
    public static double divide(double numerator, double denominator) throws DivisionByZeroException {
        if (denominator == 0) {
            throw new DivisionByZeroException("Sıfıra bölme işlemi hatası");
        }
        return numerator / denominator;
    }
}
