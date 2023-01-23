package atividade2;

public class Atividade2 {
    
    public static void main(String[] args) {
        
        try {
            Quadrado quadrado = new Quadrado(5);
            quadrado.getNomeFigura();
            quadrado.getArea();
            quadrado.getPerimetro();
            
            Triangulo triangulo = new Triangulo(10,7,5);
            triangulo.getNomeFigura();
            triangulo.getArea();
            triangulo.getPerimetro();
            
        } catch (Exception e) { System.out.println(e); }
        
    }

}
