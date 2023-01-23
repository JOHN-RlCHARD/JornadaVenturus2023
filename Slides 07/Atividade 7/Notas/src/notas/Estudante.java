package notas;

public class Estudante {

    private String nome;
    private double[] notas = new double[3];
    private double mediaFinal;
    
    public Estudante (String nome, double[] notas) throws Exception {
        for (int i=0; i<this.notas.length; i++) {
            if (notas[i]<0 || notas[i]>10) throw new Exception ("Nota "+(i+1)+" inválida.");
        }
        
        this.notas = notas;
        this.nome = nome;
        this.mediaFinal = mediaFinal();
    }
    
    private double mediaFinal() {
        return ((notas[0]*30)+(notas[1]*35)+(notas[2]*35))/100;
    }
    
    public void situacao() {
        if (this.mediaFinal < 6.0) {
            System.out.format("O Aluno "+this.nome+" está reprovado com média %.2f", mediaFinal);
            System.out.format("\nFaltam %.2f pontos para obter o mínimo a ser aprovado.\n", (6.0-mediaFinal));
        } else {
            System.out.format("O Aluno "+this.nome+" está aprovado com média %.2f\n", mediaFinal);
        }
    }
    
}
