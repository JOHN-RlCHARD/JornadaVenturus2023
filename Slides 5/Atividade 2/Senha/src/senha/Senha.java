package senha;
import java.util.*;

public class Senha {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String senha = "2023";
        boolean access = false;
        
        while (access == false) {
            System.out.print("Senha: ");
            String senhaDigitada = sc.next();
            if (senhaDigitada.equals(senha)) {
                System.out.println("Acesso Permitido");
                access = true;
            } else System.out.println("Senha Inválida, tente novamente.");
        }
        
        
    }

}
