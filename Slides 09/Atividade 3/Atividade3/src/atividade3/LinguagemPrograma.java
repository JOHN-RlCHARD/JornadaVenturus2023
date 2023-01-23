package atividade3;

public class LinguagemPrograma implements Linguagem {
    
    public String nome, linguagem, experiencia;
    
    public LinguagemPrograma (String nome, String linguagem, String experiencia) {
        this.nome = nome;
        this.linguagem = linguagem;
        this.experiencia = experiencia;
    }
    
    @Override
    public void pessoa() {
        System.out.println(this.nome);
    }
    
    @Override
    public void linguagemProgramacao() {
        System.out.println("Trabalha com "+this.linguagem);
    }
    
    @Override
    public void experiencia() {
        System.out.println("Possui "+this.experiencia+" de experiencia");
    }
    
}
