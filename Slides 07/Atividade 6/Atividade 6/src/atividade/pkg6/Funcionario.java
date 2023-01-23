package atividade.pkg6;

public class Funcionario {

    private String nome;
    private double imposto, salarioBruto;
    
    public Funcionario(String nome, double salarioBruto, double imposto) throws Exception {
        if (salarioBruto<=0 || imposto<=0) throw new Exception("Erro de entrada");
        
        this.nome = nome;
        this.imposto = imposto;
        this.salarioBruto = salarioBruto;
    }
    
    @Override
    public String toString() {
        String ret = "Nome: "+this.nome+"\n"
                + "Imposto: "+String.format("%.2f",this.imposto)+"\n"
                + "Salario Bruto: "+String.format("%.2f",this.salarioBruto)+"\n"
                + "Salario Liquido: "+String.format("%.2f", this.salarioLiquido());
        return ret;
    }
    
    public double salarioLiquido() {
        return this.salarioBruto - this.imposto;
    }
    
    public void aumentoSalario(double aumento) {
        this.salarioBruto = salarioBruto + (salarioBruto*aumento/100); 
    }
    
}
