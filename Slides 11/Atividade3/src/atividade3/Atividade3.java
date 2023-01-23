package atividade3;

public class Atividade3 {
    
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero("Branco", 10, 4, 4);
        m.emitirSom();
        m.alimentar();
        
        System.out.println("");
        
        Lobo l = new Lobo("Preto", 35, 6, 4);
        l.emitirSom();
        l.alimentar();
        
        System.out.println("");
        
        Cachorro c = new Cachorro("Caramelo", 15, 4, 4);
        c.emitirSom();
        c.enterrarOsso();
        c.abanarRabo();
        c.reagir("Agradavel");
        c.reagir("Agressiva");
        c.reagir(true);
        c.reagir(false);
        c.reagir(13);
        c.reagir(8);
        c.reagir();

    }

}
