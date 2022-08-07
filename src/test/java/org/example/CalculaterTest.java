package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculaterTest {



    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void sum() {
        assertEquals(4, Calculater.sum(2,2));
        assertEquals(2, Calculater.sum(3,-1));
        assertEquals(-5, Calculater.sum(-2,-3));
        assertEquals(0, Calculater.sum(-2,2));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("multiply 2 numbers")
    void multiply() {
        assertAll(()->assertEquals(4, Calculater.sum(2,2)),
                ()->   assertEquals(-3, Calculater.sum(3,-1)),
                ()-> assertEquals(6, Calculater.sum(-2,-3)),
                ()->  assertEquals(0, Calculater.sum(-2,0)));
        //test




    }

    @Test
    void testSum() {
    }

    @Test
    void testMultiply() {
    }
}