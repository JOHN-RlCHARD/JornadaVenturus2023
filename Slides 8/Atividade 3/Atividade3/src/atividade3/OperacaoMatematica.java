package atividade3;

public class OperacaoMatematica {

    static void parOuImpar(int n) {
        String str = (n%2==0) ? n+" é par." : n+" é ímpar.";
        System.out.println(str);
    }
    
    static void negativoOuPositivo(int n) {
        String str = (n<0) ? n+" é negativo." : n+" é positivo.";
        System.out.println(str);
    }
    
}
