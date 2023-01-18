package matriz;
import java.util.*;

public class Matriz {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaTotal=0, somaL3=0, somaC2=0, somaDiagonal=0; 
        
        for (int i=0; i<matriz[0].length; i++) {
            for (int j=0; j<matriz.length; j++) {
                System.out.print("Digite o elemento ["+(i)+"]["+j+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nMatriz digitada: ");
        for (int i=0; i<matriz[0].length; i++) {
            for (int j=0; j<matriz.length; j++) {
                somaTotal+= matriz[i][j];
                if (i==j) somaDiagonal += matriz[i][j];
                if (i==2) somaL3 += matriz[i][j];
                if (j==1) somaC2 += matriz[i][j];
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("\n");
        }
        
        System.out.println("Soma total dos elementos: "+somaTotal);
        System.out.println("Soma dos elementos da linha 3: "+somaL3);
        System.out.println("Soma dos elementos da coluna 2: "+somaC2);
        System.out.println("Soma dos elementos da diagonal principal: "+somaDiagonal);
        
    }

}
