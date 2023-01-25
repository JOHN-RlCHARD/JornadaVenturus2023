package com.mycompany.atividade2;
import java.util.Date;
import java.util.*;

public class MaiorIdade {
    
    public static String checar(int anoNasc) {
        
        Date date = new Date();
        String str = date.toString().substring(24, date.toString().length());
        int anoAtual = Integer.valueOf(str);
        
        int idade = anoAtual - anoNasc;
        
        if (idade<16) return "Não pode votar";
        if ((idade>=16&&idade<18) || idade>=70) return "Voto facultativo";
        return "Voto obrigatório";
        
    }
    
}
