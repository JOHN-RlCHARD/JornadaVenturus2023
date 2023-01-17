package somamultmatriz;
import java.util.*;

public class SomaMultMatriz {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int matrizA[][] = {{1, 2}, {4,5}};
        int matrizB[][] = {{7, 8}, {10,11}};
        int matrizSoma[][] = new int[2][2];
        int matrizMult[][] = new int[2][2];
        
        for (int i=0; i<matrizA[0].length; i++) {
            for (int j=0; j<matrizA.length; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
                matrizMult[i][j] = matrizA[i][j] * matrizB[i][j];
            }
        }
        
        //IMPRESSAO MATRIZ SOMA
        System.out.println("*** MATRIZ SOMA ***");
        for (int i=0; i<matrizA[0].length; i++) {
            for (int j=0; j<matrizA.length; j++) {
                System.out.print(matrizSoma[i][j]+"\t");
            }
            System.out.println("");
        }
        
        //IMPRESSAO MATRIZ MULT
        System.out.println("\n*** MATRIZ MULT ***");
        for (int i=0; i<matrizA[0].length; i++) {
            for (int j=0; j<matrizA.length; j++) {
                System.out.print(matrizMult[i][j]+"\t");
            }
            System.out.println("");
        }
        
    }

}
