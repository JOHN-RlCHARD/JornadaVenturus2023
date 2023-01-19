package campeonato;
import java.util.*;

public class Campeonato {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String[] times = new String[10];
        boolean duplicate;
        
        for (int i=0; i<times.length; i++) {
            System.out.println("------- Time "+(i+1)+" --------");
            System.out.print("Nome: "); //times[i] = sc.next();
            times[i] = (i+1)+"";
        }
        
        //CALCULAR TODOS OS JOGOS
        String[][] jogos = new String[(times.length-1)*times.length][2];
        jogos = calcJogos(times);
        
        //CALCULAR RODADAS
        String[][][] rodadas = new String[(times.length-1)*2][times.length/2][2];
        rodadas = calcRodadas(jogos);
        
        //IMPRIMIR RODADAS
        printRodadas(rodadas);
        
    }
    
    static String[][] calcJogos(String[] times) {
        String[][] jogos = new String[(times.length-1)*times.length][2];
        int aux = 0;
        
        for (int i=0; i<times.length; i++) {
            for (int j=0; j<times.length; j++) {
                    if (i != j) {
                    jogos[aux][0] = times[i];
                    jogos[aux][1] = times[j];
                    aux++;
                }
            }
        }
        
        return jogos;
        
    }
    
    static String[][][] calcRodadas(String[][] jogos) {
        
        String[][][] rodadas = new String[jogos.length/10*2][jogos.length/((jogos.length/10)*2)][2];
        System.out.println("rodadas["+rodadas.length+"]["+rodadas[0].length+"]["+rodadas[0][0].length+"]");
        
        boolean duplicate;
        int rodadasCalculadas;
        
        int tentativas;
        rodadasCalculadas = 0;

        //FOR PARA CALCULAR RODADAS
        for (int i=0; i<18; i++) {

            //TIMES JOGADOS NA RODADA
            String[] timesJogados = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};

            //CALCULAR JOGOS DA RODADA
            for (int j=0; j<5; j++) {
                String strJogos[] = new String[2];
                String time1="", time2="";
                int jogo;
                tentativas = 0;
                do {

                    //PEGAR UM JOGO ALEATORIO DA ARRAY DE JOGOS
                    jogo = (int) (Math.random()*90);

                    if (jogos[jogo] != null) {

                        duplicate = false;
                        time1 = jogos[jogo][0];
                        time2 = jogos[jogo][1];
                        strJogos[0] = time1;
                        strJogos[1] = time2;

                        rodadas[i][j][0] = strJogos[0];
                        rodadas[i][j][1] = strJogos[1];

                        //VERIFICAR SE OS TIMES JA JOGARAM NA RODADA
                        for (int k=0; k<10; k++) {
                            if (timesJogados[k].equals(time1) || timesJogados[k].equals(time2)) {
                                duplicate = true;
                            }
                        }

                    } else duplicate = true;

                    tentativas++;

                } while ( duplicate == true && tentativas < 1000);

                //if (tentativas < 200) {
                    //REMOVER JOGO DA ARRAY DE JOGOS
                    jogos[jogo] = null;

                    //GRAVAR TIMES QUE JOGARAM NA RODADA
                    timesJogados[j] = time1;
                    timesJogados[9-j] = time2;

                    rodadasCalculadas++;
                //}

                }

            }
        
        return rodadas;
    }
    
    static void printRodadas(String[][][] rodadas) {
    
        for (int i=0; i<rodadas.length;i++) {
            System.out.println("*** RODADA "+(i+1)+" ***");
            for (int j=0; j<rodadas[0].length; j++) {
                System.out.println(rodadas[i][j][0]+" X "+rodadas[i][j][1]);
            }
        }
        
    }

}
