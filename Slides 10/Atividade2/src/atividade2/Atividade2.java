package atividade2;
import java.util.*;

public class Atividade2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double altura, largura, raio;
        Cor cor = null;
        int optCor;
        
        System.out.println("Digite os lados do Retangulo: ");
        System.out.print("Largura: "); largura = sc.nextDouble();
        System.out.print("Altura: "); altura = sc.nextDouble();
        System.out.println("Escolha a cor do Retangulo: "
                + "\n[1] BLACK"
                + "\n[2] BLUE"
                + "\n[3] RED");
        optCor = sc.nextInt();
        
        switch (optCor) {
            default: 
                System.out.println("Opcao Inválida.");
                break;
            case 1:
                cor = Cor.BLACK;
                break;
            case 2:
                cor = Cor.BLUE;
                break;
            case 3:
                cor = Cor.RED;
                break;
        }
        
        try {
            Retangulo r = new Retangulo(largura, altura, cor);
            r.area();
            System.out.println(r.toString());
        } catch (Exception e) { System.out.println(e); }
        
        System.out.println("Digite o raio do Circulo: ");
        System.out.print("Raio: "); raio = sc.nextDouble();
        System.out.println("Escolha a cor do Circulo: "
                + "\n[1] BLACK"
                + "\n[2] BLUE"
                + "\n[3] RED");
        optCor = sc.nextInt();
        
        switch (optCor) {
            default: 
                System.out.println("Opcao Inválida.");
                break;
            case 1:
                cor = Cor.BLACK;
                break;
            case 2:
                cor = Cor.BLUE;
                break;
            case 3:
                cor = Cor.RED;
                break;
        }
        
        try {
            Circulo c = new Circulo(raio, cor);
            c.area();
            System.out.println(c.toString());
        } catch (Exception e) { System.out.println(e); }
        
    }

}
