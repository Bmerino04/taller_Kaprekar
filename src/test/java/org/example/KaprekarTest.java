package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class KaprekarTest {

    private static Kaprekar k;
    @BeforeAll
    public static void setUp() {
        k = new Kaprekar();
    }

    @Test
    public void testKaprekarOperation1() {
        // Prueba con el número 3524 (debe devolver 3087)
        Assertions.assertEquals(3087, k.kaprekarOp(3524));
    }
    @Test
    public void testKaprekarOperation2() {
        // Prueba con el número 1000 (debe devolver 999)
        Assertions.assertEquals(999, k.kaprekarOp(1000));
    }

    @Test
    public void testKaprekarOperation3() {
        // Prueba con el número 5200 (debe devolver 5175)
        Assertions.assertEquals(5175, k.kaprekarOp(5200));
    }
    @Test
    public void testKaprekarOperation4() {
        // Prueba con el número 2111 (debe devolver 999)
        Assertions.assertEquals(999, k.kaprekarOp(2111));
    }

    @Test
    public void testIterationsToKaprekarConstant1() {
        // Prueba con el número 3524 (llega a 6174 en 3 iteraciones)
        Assertions.assertEquals(3, k.itKaprekar(3524));
    }

    @Test
    public void testIterationsToKaprekarConstant2() {
        // Prueba con el número 5200 (llega a 6174 en 7 iteraciones)
        Assertions.assertEquals(7, k.itKaprekar(5200));
    }

    @Test
    public void testIterationsToKaprekarConstant3() {
        // Prueba con el número 1000 (llega a 6174 en 5 iteraciones)
        Assertions.assertEquals(5, k.itKaprekar(1000));
    }
}