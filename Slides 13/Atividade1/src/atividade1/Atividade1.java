package atividade1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Atividade1 {
    
    public static void main(String[] args) {
        
        List<Integer> l = Arrays.asList(3, 4, 5, 10, 7, 14, 16);
        
        Stream<Integer> st1 = l.stream().map(x -> x*10);
        
        System.out.println("Stream 1 Multiplicada por 10: ");
        st1.forEach(System.out::println);
        
        Stream<Integer> st2 = l.stream().filter(x->x%2==0).map(x->x*20);
        
        System.out.println("\nStream 2 somente pares multiplicados por 20: ");
        st2.forEach(System.out::println);
        
    }

}
