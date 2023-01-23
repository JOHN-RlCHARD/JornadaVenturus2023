package salario;
import java.util.*;

public class Salario {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double salarioInicial, pAumento = 1.5;
        
        System.out.println("Digite o salario inicial: ");
        salarioInicial = sc.nextDouble();
        
        for (int i=2010; i<=2022; i++) {
            
            double salario;
            
            pAumento *= 2;
            salario = salarioInicial+(salarioInicial*pAumento/100);
            
            if(i==2010) {
                salario = 2000;
                pAumento = 0;
            }
            if(i==2011) {
                pAumento = 1.5;
                salario = salarioInicial+(salarioInicial*pAumento/100);
            }
            
            System.out.println("__________________");
            System.out.println(i);
            System.out.println("Aumento: "+pAumento+"%");
            System.out.println("Salario: R$ "+salario);
        }
        
    }

}
