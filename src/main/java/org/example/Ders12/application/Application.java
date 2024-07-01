package org.example.Ders12.application;

import org.example.Ders12.utilities.MathUtils;

public class Application {
    public static void main(String[] args) {
        try {
            double result = MathUtils.divide(10, 0);
        } catch (org.example.Ders12.exceptions.DivisionByZeroException e) {
            throw new RuntimeException(e);
        }
    }
}
