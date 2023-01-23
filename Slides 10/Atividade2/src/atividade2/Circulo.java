package atividade2;

public class Circulo extends Forma {
    
    double raio;

    public Circulo(double raio, Cor cor) throws Exception {
        super(cor);
        if (raio <= 0 ) throw new Exception("Medidas inválidas");
        
        setRaio(raio);
        
    }
    
    @Override
    public void area() {
        System.out.format("Área do Círculo: %.2f\n", (Math.PI*raio*raio));
    }
    
    @Override
    public String toString() {
        return "Raio: "+raio+"\nCor: "+getCor();
    }

    public double getRaio() {
        return raio;
    }

    private void setRaio(double raio) {
        this.raio = raio;
    }
    
}
