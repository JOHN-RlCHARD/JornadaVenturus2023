package com.mycompany.atividade1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSoma() {
        assertEquals(0, Calculadora.soma(0,0));
        assertEquals(201, Calculadora.soma(1,200));
        assertEquals(-241, Calculadora.soma(-541,300));
        assertEquals(-26, Calculadora.soma(24,-50));
    }

    @Test
    public void testSubtracao() {
        assertEquals(0, Calculadora.subtracao(0,0));
        assertEquals(-199, Calculadora.subtracao(1,200));
        assertEquals(-841, Calculadora.subtracao(-541,300));
        assertEquals(74, Calculadora.subtracao(24,-50));
    }

    @Test
    public void testDivisao() throws Exception {
        assertThrows(IllegalArgumentException.class, 
                ()-> {
                    Calculadora.divisao(0, 0);
                });
        assertEquals(200, Calculadora.divisao(200,1));
        assertEquals(-0.5, Calculadora.divisao(-1,2));
        assertEquals(-6, Calculadora.divisao(300,-50));
    }

    @Test
    public void testMultiplicacao() {
        assertEquals(0, Calculadora.multiplicacao(0,0));
        assertEquals(200, Calculadora.multiplicacao(1,200));
        assertEquals(-1500, Calculadora.multiplicacao(-5,300));
        assertEquals(-1200, Calculadora.multiplicacao(24,-50));
    }
    
}
