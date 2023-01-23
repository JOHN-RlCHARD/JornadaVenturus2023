package programasolidario;
import java.util.*;

public class ProgramaSolidario {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opt;
        
        System.out.println("Bem vindo(a) ao Programa Solidário!");
        System.out.println("Para doar selecione uma das opçoes abaixo:");
        System.out.println("[1] para doar R$10");
        System.out.println("[2] para doar R$25");
        System.out.println("[3] para doar R$50");
        System.out.println("[4] para doar outros valores");
        System.out.println("[5] para cancelar");
        
        opt = sc.nextInt();
        
        switch (opt) {
            default:
                System.out.println("Opçao invalida.");
                break;
                
            case 1:
                System.out.println("Obrigado por doar R$10 !!");
                break;
                
            case 2:
                System.out.println("Obrigado por doar R$25 !!");
                break;
                
            case 3:
                System.out.println("Obrigado por doar R$50 !!");
                break;
                
            case 4:
                System.out.println("Digite o valor desejado:");
                double valor = sc.nextDouble();
                System.out.format("Obrigado por doar R$%.2f !!\n", valor);
                break;
                
            case 5:
                System.out.println("Operação cancelada.");
                break;
                
        }
        
    }

}
