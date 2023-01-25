package com.mycompany.atividade4;

public class Matematica {
    
    public static double multiplicar(double x, double y) throws Exception {
        if (x>999) throw new IllegalArgumentException("Valor de x maior que 999");
        return Math.round(x*y*100.0)/100.0;
    }
    
    public static double dividir(double x, double y) throws Exception {
        if (y<=0) throw new IllegalArgumentException("Valor de y negativo ou igual a zero");
        return Math.round(x/y*100.0)/100.0;
    }
    
}
