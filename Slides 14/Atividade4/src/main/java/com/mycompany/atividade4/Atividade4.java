package com.mycompany.atividade4;

public class Atividade4 {

    public static void main(String[] args) {
        try {
           
            System.out.println(Matematica.dividir(10, 3));
            System.out.println(Matematica.multiplicar(50, 2));
            
        } catch (Exception e) {System.out.println(e);}
    }
}
