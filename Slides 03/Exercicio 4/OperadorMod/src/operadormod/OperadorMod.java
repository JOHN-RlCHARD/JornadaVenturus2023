package operadormod;

public class OperadorMod {
    
    public static void main(String[] args) {
        
        int w1 = 4;
        double w2 = 4.0;
        double div = 3.33;
        
        w1 %= div;
        w2 %= div;
        
        System.out.format("w1 = %.2f\nw2 = %.2f\n", (double)w1 ,w2);
        
    }

}
