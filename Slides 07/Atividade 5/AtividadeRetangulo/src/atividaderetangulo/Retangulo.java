package atividaderetangulo;

public class Retangulo {

    private double largura, altura;
    
    public Retangulo(double largura, double altura) throws Exception {
        if (largura <= 0 || altura <= 0) throw new Exception("Lados inválidos");
        this.largura = largura;
        this.altura = altura;
    }
    
    public double area() {
        return this.largura*this.altura;
    }
    
    public double perimetro() {
        return (this.largura+this.altura)*2;
    }
    
    public double diagonal() {
        return Math.sqrt((altura*altura)+(largura*largura));
    }
    
}
