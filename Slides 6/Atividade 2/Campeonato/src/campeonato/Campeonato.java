package campeonato;
import java.util.*;

public class Campeonato {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String[] times = new String[10];
        String[][] jogos = new String[18*5][2];
        boolean duplicate;
        
        for (int i=0; i<times.length; i++) {
            System.out.println("------- Time "+(i+1)+" --------");
            System.out.print("Nome: "); //times[i] = sc.next();
            times[i] = (i+1)+"";
        }
        
        //CALCULAR TODOS OS JOGOS
        int aux = 0;
        for (int i=0; i<10; i++) {
                for (int j=0; j<10; j++) {
                        if (i != j) {
                        jogos[aux][0] = times[i];
                        jogos[aux][1] = times[j];
                        aux++;
                    }
                
            }
        }
        
        //IMPRIMIR RODADAS
        for (int i=0; i<9; i++) {
            
            System.out.println("*** RODADA "+(i+1)+" ****");
            
            String[] timesJogados = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
            
            //CALCULAR JOGOS DA RODADA
            for (int j=0; j<5; j++) {
                String strJogo = "-";
                String time1="", time2="";
                int jogo;
                
                do {
                    
                    //PEGAR UM JOGO ALEATORIO DA ARRAY DE JOGOS
                    jogo = (int) (Math.random()*90);
                    
                    if (jogos[jogo] != null) {
                    
                        duplicate = false;
                        time1 = jogos[jogo][0];
                        time2 = jogos[jogo][1];
                        strJogo = "("+jogo+")"+time1 + " X " + time2;

                        //VERIFICAR SE OS TIMES JA JOGARAM NA RODADA
                        for (int k=0; k<10; k++) {
                            if (timesJogados[k].equals(time1) || timesJogados[k].equals(time2)) {
                                duplicate = true;
                            }
                        }
                    
                    } else duplicate = true;
                    
                } while ( duplicate == true );
                
                //REMOVER JOGO DA ARRAY DE JOGOS
                jogos[jogo] = null;
                
                //GRAVAR TIMES QUE JOGARAM NA RODADA
                timesJogados[j] = time1;
                timesJogados[9-j] = time2;
                
                System.out.println(strJogo);

            }
            
        }
        
    }

}
