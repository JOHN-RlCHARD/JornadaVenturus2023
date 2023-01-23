package dolar;

public class Conversao {
    
    public static double converter ( double cotacao, double qtd ) throws Exception {
        if (cotacao <= 0 || qtd <= 0) throw new Exception("Valor inválido");
        
        double valor = qtd*cotacao + ((qtd*0.06)*cotacao);
        
        return valor;
    }
    
}
