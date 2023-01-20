package atividade2;
import java.util.*;

public class Atividade2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Carro eclipse = new Carro("Ciano", "Mitsubish", 1998);
        
        eclipse.acelerar();
        eclipse.pegarMarcha(1);
        
        eclipse.ligar();
        eclipse.acelerar();
        eclipse.pegarMarcha(1);
        eclipse.acelerar();
        eclipse.acelerar();
        eclipse.acelerar();
        eclipse.acelerar();
        eclipse.acelerar();
        eclipse.pegarMarcha(2);
        eclipse.acelerar();
        eclipse.acelerar();
        eclipse.acelerar();
        
        eclipse.pegarMarcha(0);
        eclipse.desligar();
        eclipse.ligar();
        
    }

}
