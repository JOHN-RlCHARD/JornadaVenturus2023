package triangulos;

public class Triangulo {
    
    private double[] lados = new double[3];
    
    public Triangulo(double ladoA, double ladoB, double ladoC) throws Exception {
        
        if ( ladoA <=0 || ladoB<=0 || ladoC<= 0 ) throw new Exception("Um dos lados é negativo.");
        if ( (ladoA + ladoB) < ladoC || (ladoA + ladoC) < ladoB || (ladoC + ladoB) < ladoA) throw new Exception("Os lados não formam um triângulo");
        
        this.lados[0] = ladoA;
        this.lados[1] = ladoB;
        this.lados[2] = ladoC;
        
    }
    
    public double semiPerimetro () {
        return (this.lados[0]+this.lados[1]+this.lados[2])/2;
    }
    
    public double area () {
        double p = semiPerimetro();
        return Math.sqrt(p*(p-this.lados[0])*(p-this.lados[1])*(p-this.lados[1]));
    }
    
}
