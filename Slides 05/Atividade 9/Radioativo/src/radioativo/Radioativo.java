package radioativo;
import java.util.*;

public class Radioativo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double mInicial, mFinal;
        int segundos = 0, minutos = 0, horas = 0;
        
        System.out.println("Digite a massa inicial: ");
        mInicial = sc.nextDouble();
        
        mFinal = mInicial;
        
        //CALCULO DO TEMPO
        while (mFinal > 0.5) {
            mFinal /= 2;
            segundos += 50;
        }
        
        //TRANSFORMAR DE SEGUNDOS PARA MINUTOS
        if (segundos >= 60) {
            minutos = segundos/60;
            segundos = segundos%60;
        }
        
        //TRANSFORMAR DE MINUTOS PARA HORAS
        if (minutos >= 60) {
            horas = minutos/60;
            minutos = minutos%60;
        }
        
        //IMPRIMIR RESULTADOS
        System.out.format("Massa inicial: %.2f gramas\n", mInicial);
        System.out.format("Massa final: %.2f gramas\n", mFinal);
        System.out.println("Tempo decorrido: "+horas+" horas "+minutos+" minutos e "+segundos+" segundos");
        
    }

}
