package atividade3;

public class Atividade3 {
    
    public static void main(String[] args) {
        
        LinguagemPrograma maria = new LinguagemPrograma("Maria", "Python", "15 anos");
        LinguagemPrograma joao = new LinguagemPrograma("Joao", "Java", "10 anos");
        
        maria.pessoa();
        maria.linguagemProgramacao();
        maria.experiencia();
        System.out.println("\n");
        joao.pessoa();
        joao.linguagemProgramacao();
        joao.experiencia();
    }

}
