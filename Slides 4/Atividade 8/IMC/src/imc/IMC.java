package imc;
import java.util.*;

public class IMC {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Double imc, altura, massa;
        int opt;
        
        String[] msg = new String[8];
        msg[0] = "Magreza grave";
        msg[1] = "Magreza moderada";
        msg[2] = "Magreza leve";
        msg[3] = "Saudável";
        msg[4] = "Sobrepeso";
        msg[5] = "Obesidade grau I";
        msg[6] = "Obesidade grau II (severa)";
        msg[7] = "Obesidade grau III (mórbida)";
        
        System.out.println("Bem vindo ao Cáculo de IMC!\n"
                + "Digite os dados para realizar o cálculo.\n");
        
        System.out.print("Altura(m): ");
        altura = sc.nextDouble();
        System.out.print("Massa(kg): ");
        massa = sc.nextDouble();
        
        imc = massa/(altura*altura);
        
        System.out.println("Deseja realizar o cálculo por qual estrutura"
                + " de repetição?\n[1]if else\n[2]switch case");
        System.out.println("OBS: caso digite uma opção inválida, será utilizada "
                + "a opção 1.");
        opt = sc.nextInt();
        
        switch (opt) {
            default:
                if (imc<16) System.out.println(msg[0]);
                else if (imc<17) System.out.println(msg[1]);
                else if (imc<18.5) System.out.println(msg[2]);
                else if (imc<25) System.out.println(msg[3]);
                else if (imc<30) System.out.println(msg[4]);
                else if (imc<35) System.out.println(msg[5]);
                else if (imc<40) System.out.println(msg[6]);
                else System.out.println(msg[7]);
                break;
                
            case 2:
                System.out.println("A fazer...\nSwitch case com float(???)");        
                
        }
        
    }

}
