package com.mycompany.atividade3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversaoTest {
    
    public ConversaoTest() {
    }

    @Test
    public void testCelsiusToFahrenheit() {
        
        assertEquals(32.0, Conversao.celsiusToFahrenheit(0.0));
        assertEquals(-459.7, Conversao.celsiusToFahrenheit(-273.15));
        assertEquals(98.6, Conversao.celsiusToFahrenheit(37.0));
        assertEquals(212.0, Conversao.celsiusToFahrenheit(100.0));
        
    }

    @Test
    public void testFahrenheitToCelsius() {
        
        assertEquals(0.0, Conversao.fahrenheitToCelsius(32.0));
        assertEquals(-45.6, Conversao.fahrenheitToCelsius(-50.0));
        assertEquals(37.0, Conversao.fahrenheitToCelsius(98.6));
        assertEquals(100.0, Conversao.fahrenheitToCelsius(212.0));
        
    }
    
}
