package valores;
import java.util.*;

public class Valores {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i;
        double[] valores = new double[3];
        
        System.out.println("Digite os seguintes valores:");
        System.out.print("I = "); i = sc.nextInt();
        System.out.print("A = "); valores[0] = sc.nextDouble();
        System.out.print("B = "); valores[1] = sc.nextDouble();
        System.out.print("C = "); valores[2] = sc.nextDouble();
        
        switch (i) {
            default:
                System.out.println("I é diferente de 1, 2 e 3.");
                break;
                
            case 1:
                for (int j = 0; j < valores.length; j++) {
                    for (int k = 0; k < valores.length; k++) {
                        if (valores[j] < valores[k]) {
                            double aux = valores[j];
                            valores[j] = valores[k];
                            valores[k] = aux;
                        }
                    }
                }
                break;
                
            case 2:
                for (int j = 0; j < valores.length; j++) {
                    for (int k = 0; k < valores.length; k++) {
                        if (valores[j] > valores[k]) {
                            double aux = valores[j];
                            valores[j] = valores[k];
                            valores[k] = aux;
                        }
                    }
                }
                break;
                
            case 3:
                double maior = valores[1];
                for (int j = 0; j < valores.length; j++) {
                    if (valores[j] > maior && j != 1) {
                        maior = valores[j];
                        double aux = valores[1];
                        valores[1] = maior;
                        valores[j] = aux;
                    }
                }
                
        }
        
        System.out.format("%.2f %.2f %.2f\n", valores[0], valores[1], valores[2]);
        
    }

}
