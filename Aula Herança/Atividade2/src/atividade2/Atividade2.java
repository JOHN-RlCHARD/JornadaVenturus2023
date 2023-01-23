package atividade2;
import java.util.*;

public class Atividade2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Homem h = new Homem("Junior", 15);
        h.falar();
        h.comer();
        h.setFome(true);
        h.comer();
        
        System.out.println("");
        
        Cao c = new Cao("Thor", 5);
        c.falar();
        c.comer();
        c.setFome(true);
        c.comer();
        
        System.out.println("");
        
        Gato g = new Gato("Tom", 6);
        g.falar();
        g.comer();
        g.setFome(true);
        g.comer();
        
        System.out.println("");
        
        Papagaio p = new Papagaio("Limas", 1);
        p.falar();
        p.comer();
        p.setFome(true);
        p.comer();
        
    }

}
