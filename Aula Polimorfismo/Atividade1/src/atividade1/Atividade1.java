package atividade1;
import java.util.*;

public class Atividade1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        PessoaFisica pf = new PessoaFisica("18948189829", "Gabriel");
        System.out.println(pf.getNome());
        
        PessoaJuridica pj = new PessoaJuridica("24901944000194", "Kalunga Ltda");
        System.out.println(pj.getNome());

    }

}
