package matriznegativos;
import java.util.*;

public class MatrizNegativos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        boolean isNegativo=false;
        
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[0].length; j++) {
                System.out.print("Digite o elemento ["+(i)+"]["+j+"]: ");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] < 0) isNegativo = true;
            }
        }
        
        System.out.println("\nMatriz digitada: ");
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("\n");
        }
        
        if (isNegativo) {
            System.out.println("Matriz modificada: ");
            for (int i=0; i<matriz.length; i++) {
                for (int j=0; j<matriz[0].length; j++) {
                    if (matriz[i][j] < 0) matriz[i][j] = 0;
                    System.out.print(matriz[i][j]+"\t");
                }
                System.out.println("\n");
            }
            
        }
        
        
    }
    
}
