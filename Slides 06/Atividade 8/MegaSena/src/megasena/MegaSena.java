package megasena;
import java.util.*;

public class MegaSena {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opt;
        
        do {
            System.out.println("Digite a quantidade de números para jogar(6 a 15)");
            opt = sc.nextInt();
        } while ( opt<6 || opt>15);
        
        //INICIAR VETOR COM O JOGO
        int[] numeros = new int[opt];
        
        //INCIO DO PREENCHIMENTO
        for (int i=0; i<opt; i++) {
            
            int rnd;
            boolean check;
            
            //LOGICA PARA NAO GERAR REPETIDOS
            do {
                check = true;
                rnd = (int) (Math.random()*60)+1;
                for (int j=0; j<opt; j++) {
                    if (rnd == numeros[j]) check = false;
                }
            } while (check == false);
            
            numeros[i] = rnd;
            
        }
        
        //ORDENAR VETOR
        ordenar(numeros);
        
        //PRINTAR JOGO
        printVect(numeros);
        
    }
    
    static void ordenar (int[] vect) {
        //ORDENAR O VETOR
        for (int j = 0; j < vect.length; j++) {
            for (int k = 0; k < vect.length; k++) {
                if (vect[j] < vect[k]) {
                    int aux = vect[j];
                    vect[j] = vect[k];
                    vect[k] = aux;
                }
            }
        }
    }
    
    static void printVect (int[] vect) {
        System.out.print("[ ");
        for (int i=0; i<vect.length; i++) {
            if (i==vect.length-1) System.out.println(vect[i]+" ]");
            else System.out.print(vect[i]+", ");
        }
    }
}
