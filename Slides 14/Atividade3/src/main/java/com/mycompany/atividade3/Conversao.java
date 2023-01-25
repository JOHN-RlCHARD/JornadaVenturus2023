package com.mycompany.atividade3;
import java.math.*;

public class Conversao {

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius*9/5)+32;
        return Math.round(fahrenheit*10.0)/10.0;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = ((fahrenheit-32)*5)/9;
        return Math.round(celsius*10.0)/10.0;
    }
    
}
