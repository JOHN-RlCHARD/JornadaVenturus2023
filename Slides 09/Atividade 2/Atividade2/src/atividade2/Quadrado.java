package atividade2;

public class Quadrado implements PropriedadesGeometricas {
    
    private double lado;
    
    public Quadrado(double lado) {
        setLado(lado);
    }

    @Override
    public void getNomeFigura() {
        System.out.println("Quadrado");
    }
    
    @Override
    public void getArea () {
        System.out.format("Área = %.2f\n",(lado*lado));
    }
    
    @Override
    public void getPerimetro () {
        System.out.format("Perímetro = %.2f\n", (lado*4));
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    
}
