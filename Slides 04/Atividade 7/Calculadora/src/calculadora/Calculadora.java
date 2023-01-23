package calculadora;
import java.util.*;

public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opt;
        double num1, num2, res = 0.0;
        
        System.out.println("Digite dois números: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        
        System.out.println("Qual operação deseja realizar?"
                + "\n[1] para soma"
                + "\n[2] para subtração"
                + "\n[3] para multiplicação"
                + "\n[4] para divisão");
        opt = sc.nextInt();
        
        switch (opt) {
            default:
                System.out.println("Opção inválida.");
                break;
                
            case 1:
                res = num1 + num2;
                break;
                
            case 2:
                res = num1 - num2;
                break;
                
            case 3:
                res = num1 * num2;
                break;
                
            case 4:
                res = num1 / num2;
                break;
                
        }
        
        System.out.format("Resultado = %.2f\n", res);
        
    }

}
