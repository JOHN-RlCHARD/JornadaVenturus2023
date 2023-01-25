package com.mycompany.atividade4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatematicaTest {
    
    public MatematicaTest() {
    }

    @Test
    public void testMultiplicar() throws Exception {
        
        assertThrows(IllegalArgumentException.class,
            () -> {
               Matematica.multiplicar(1000, 2);
            });
        assertThrows(IllegalArgumentException.class,
            () -> {
               Matematica.multiplicar(5300, 2);
            });
        assertEquals(200, Matematica.multiplicar(10, 20));
        assertEquals(-38, Matematica.multiplicar(-2, 19));
        assertEquals(-450, Matematica.multiplicar(-15, 30));
        
    }

    @Test
    public void testDividir() throws Exception {
        
        assertThrows(IllegalArgumentException.class,
            () -> {
               Matematica.dividir(23, 0);
            });
        assertThrows(IllegalArgumentException.class,
            () -> {
               Matematica.dividir(434, -20);
            });
        assertEquals(-2, Matematica.dividir(-30, 15));
        assertEquals(57, Matematica.dividir(114, 2));
        assertEquals(14.75, Matematica.dividir(59, 4));
        
    }
    
}
