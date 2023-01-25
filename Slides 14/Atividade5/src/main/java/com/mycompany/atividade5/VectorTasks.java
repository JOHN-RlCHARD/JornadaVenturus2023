package com.mycompany.atividade5;

public class VectorTasks {
    
    double[] vect;
    
    public VectorTasks(double[] vect) {
        this.vect = vect;
    }

    public double findMin() throws Exception {
        
        if (vect == null) throw new IllegalArgumentException("Vetor null");
        
        double min = vect[0];
        for (int i=0; i<vect.length;i++) {
            if(vect[i]<min) min = vect[i];
        }
        
        return min;
        
    }
    
    public void multiplyBy10() throws Exception {
        
        if (vect == null || vect.length == 0) throw new IllegalArgumentException("Vetor vazio");
        
        for (int i=0; i<vect.length;i++) {
            vect[i] = vect[i]*10.0;
        }
        
    }
    
    public boolean equals(double[] vect) {
        if (vect == null) return false;
        if (this.vect.length != vect.length) return false;
        
        for (int i=0; i<this.vect.length; i++) {
            if (this.vect[i] != vect[i]) return false;
        }
        
        return true;
        
    }
    
}
