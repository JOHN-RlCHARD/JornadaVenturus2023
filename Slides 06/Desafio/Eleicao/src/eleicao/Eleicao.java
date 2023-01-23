package eleicao;
import java.util.*;

public class Eleicao {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String[] candidatos = new String[5];
        int[] votosCandidatos = {0, 0, 0, 0, 0};
        int qtdAlunos = 0, votos = 0;
        
        System.out.println("\n*** CANDIDATOS ***");
        for (int i=0; i<5; i++) {
            System.out.println("Candidato "+(i+1));
            System.out.print("Nome: "); candidatos[i] = sc.next();
        }
        
        while (qtdAlunos <= 0) {
            System.out.println("\nQuantidade de alunos a votar: ");
            qtdAlunos = sc.nextInt();
        }
        
        System.out.println("\n*** VOTAÇÃO ***");
        
        while (votos != qtdAlunos) {
            System.out.println("Escolha seu voto:"
                    + "\n[1] "+candidatos[0]
                    + "\n[2] "+candidatos[1]
                    + "\n[3] "+candidatos[2]
                    + "\n[4] "+candidatos[3]
                    + "\n[5] "+candidatos[4]
            );
            System.out.println("Votos contabilizados: "+votos);
            
            int opt = sc.nextInt();
            
            if (opt < 1 || opt > 5) System.out.println("Voto Inválido, tente novamente.");
            else {
                switch (opt) {
                    case 1:
                        votosCandidatos[0]++;
                        break;
                    case 2:
                        votosCandidatos[1]++;
                        break;
                    case 3:
                        votosCandidatos[2]++;
                        break;
                    case 4:
                        votosCandidatos[3]++;
                        break;
                    case 5:
                        votosCandidatos[4]++;
                        break;
                }
                votos++;
            }
            
        }
        
        int vencedor = 0;
        for (int i=0; i<5; i++) {
            if (votosCandidatos[i] > votosCandidatos[vencedor]) vencedor = i;
        }

        System.out.println("\n*** RESULTADOS ***");
        System.out.println("Votos por Candidatos:");
        for (int i=0; i<5; i++) {
            System.out.println(candidatos[i]+": "+votosCandidatos[i]);
        }
        System.out.println("Total de votos: "+votos);
        System.out.println("VENCEDOR: "+candidatos[vencedor]);
        
    }

}
