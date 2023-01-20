package atividade2;

public class Triangulo implements PropriedadesGeometricas{

    private double ladoA, ladoB, ladoC;
    
    public Triangulo(double ladoA, double ladoB, double ladoC) throws Exception {
        if (ladoA+ladoB<ladoC || ladoC+ladoB<ladoA || ladoA+ladoC<ladoB)
            throw new Exception("O triangulo não pode ser formado");
        
        setLadoA(ladoA);
        setLadoB(ladoB);
        setLadoC(ladoC);
        
    }
    
    @Override
    public void getNomeFigura() {
        System.out.println("Triângulo");
    }
    
    public double semiPerimetro () {
        return (this.ladoA+this.ladoB+this.ladoC)/2;
    }
    
    @Override
    public void getArea () {
        double p = semiPerimetro();
        System.out.format("Área = %.2f\n",Math.sqrt(p*(p-this.ladoA)*(p-this.ladoB)*(p-this.ladoC)));
    }
    
    @Override
    public void getPerimetro () {
        System.out.format("Perímetro = %.2f\n", (semiPerimetro()*2));
    }

    private void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    private void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    private void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }
    
    
    
}
