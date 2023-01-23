package atividade1;
import java.util.*;

public class Atividade1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int senha;
        Gerente cleber = new Gerente("Cleber", "17798478924", 2200.00, 123456);
        
        System.out.println("Digite a senha:");
        senha = sc.nextInt();
        
        String str = (cleber.autentica(senha)) ? "Acesso permitido" : "Acesso negado";
        System.out.println(str);
        
    }

}
