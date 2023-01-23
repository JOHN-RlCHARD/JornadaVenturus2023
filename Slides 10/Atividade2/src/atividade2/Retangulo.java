package atividade2;

public class Retangulo extends Forma {
    
    double largura, altura;

    public Retangulo(double largura, double altura, Cor cor) throws Exception {
        super(cor);
        if (largura <= 0 || altura <= 0) throw new Exception("Medidas inválidas");
        
        setLargura(largura);
        setAltura(altura);
        
    }
    
    @Override
    public void area() {
        System.out.format("Área do Retângulo: %.2f\n", (largura*altura));
    }
    
    @Override
    public String toString() {
        return "Largura: "+largura+"\nAltura: "+altura+"\nCor: "+getCor();
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    private void setLargura(double largura) {
        this.largura = largura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }
    
}
