package radioativo;

public class MaterialRadioativo {

    private double massa, massaInicial;
    private int segundos;
    
    public MaterialRadioativo(double massa) throws Exception {
        if (massa<=0) throw new Exception("Massa inválida.");
        this.massaInicial = massa;
        this.massa = massaInicial;
        this.segundos = 0;
    }
    
    public void reduzir() {
        while (massa > 0.5) {
            reduzMetade();
        }
    }
    
    public void printTempo() {
        int minutos = 0, horas = 0;
        
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
        System.out.format("Massa inicial: %.2f gramas\n", massaInicial);
        System.out.format("Massa final: %.2f gramas\n", massa);
        System.out.println("Tempo decorrido: "+horas+" horas "+minutos+" minutos e "+segundos+" segundos");
        
    }
    
    private void reduzMetade() {
        this.massa /= 2;
        this.segundos += 50;
    }
    
}
