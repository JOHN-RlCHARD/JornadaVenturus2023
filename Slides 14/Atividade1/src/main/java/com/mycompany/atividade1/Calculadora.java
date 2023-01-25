package com.mycompany.atividade1;

public class Calculadora {

    public static double soma(double n1, double n2) {
        return n1+n2;
    }
    
    public static double subtracao(double n1, double n2) {
        return n1-n2;
    }
    
    public static double divisao(double n1, double n2) throws Exception {
        if (n2==0) throw new IllegalArgumentException("Divisor 0 não é valido.");
        return n1/n2;
    }
    
    public static double multiplicacao(double n1, double n2) {
        return n1*n2;
    }
    
}
