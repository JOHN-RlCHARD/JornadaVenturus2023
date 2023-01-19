package empresa;

public class Salario {

    private double salarioInicial, primeiroAumento;
    private int anoContratacao;
    
    public Salario(double salarioInicial, int anoContratacao) throws Exception {
        
        if (salarioInicial <= 0 || anoContratacao <= 1900 || anoContratacao > 2023) 
            throw new Exception ("Erro de inserção");
        
        this.anoContratacao = anoContratacao;
        this.salarioInicial = salarioInicial;
        this.primeiroAumento = 0;
        
    }
    
    public void Aumento(double primeiroAumento) throws Exception {
        if (primeiroAumento<=0 || primeiroAumento>100) 
            throw new Exception ("Porcentagem inválida");
        
        this.primeiroAumento = primeiroAumento;
    }
    
    public void calcSalario(int ano) throws Exception {
        if (ano<=anoContratacao) 
            throw new Exception ("Porcentagem inválida");
        
        if (primeiroAumento==0) 
            throw new Exception ("O Funcionário ainda não recebeu o primeiro aumento.");
        
        double aumento = primeiroAumento;
        double aumentoAnterior = primeiroAumento;
        
        for (int i=0; i<ano-anoContratacao+1; i++) {
            System.out.println("*** Ano "+(i+anoContratacao)+" ***");
            
            if (i<=1) aumento = (primeiroAumento*i);
            else {
                aumento = aumentoAnterior*2;
                aumentoAnterior = aumento;
            }
            
            System.out.format("Porcentagem de aumento: %.2f", aumento);
            System.out.print("%\n");
            System.out.format("Salário no ano: R$ %.2f\n", (salarioInicial*aumento/100)+salarioInicial);
        } 
    }
    
}
