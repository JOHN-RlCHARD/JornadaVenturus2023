package com.mycompany.atividade5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class VectorTasksTest {
    
    double[] vect1 = null;
    double[] vect2 = {1, 2, 3, 4, 5, 9};
    double[] vect3 = {4, 1, 7, -10};
    double[] vect4 = {-2, -1, 7, 200, -93};
    
    VectorTasks vt1 = new VectorTasks(vect1);
    VectorTasks vt2 = new VectorTasks(vect2);
    VectorTasks vt3 = new VectorTasks(vect3);
    VectorTasks vt4 = new VectorTasks(vect4);
    
    public VectorTasksTest() {
    }

    @Test
    public void testFindMin() throws Exception {
        
        assertThrows(IllegalArgumentException.class,
            () -> {
               vt1.findMin();
            });
        assertEquals(1, vt2.findMin());
        assertEquals(-10, vt3.findMin());
        assertEquals(-93, vt4.findMin());
        
    }

    @Test
    public void testMultiplyBy10() throws Exception {
        
        assertThrows(IllegalArgumentException.class,
            () -> {
               vt1.multiplyBy10();
            });
        double[] v1 = {10, 20, 30, 40, 50, 90};
        vt2.multiplyBy10();
        assertTrue(vt2.equals(v1));
        
        double[] v2 = {40, 10, 70, -100};
        vt3.multiplyBy10();
        assertTrue(vt3.equals(v2));
        
        double[] v3 = {-20, -10, 70, 2000, -930};
        vt4.multiplyBy10();
        assertTrue(vt4.equals(v3));
        
    }
    
}
