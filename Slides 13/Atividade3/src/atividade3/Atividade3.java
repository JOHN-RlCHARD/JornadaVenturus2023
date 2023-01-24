package atividade3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Atividade3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Entre com o caminho: ");
        String path = sc.next();
        File file = new File(path);
        List<List<String>> funcionarios = new ArrayList<>();
        Double salario;
        
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(file));
        
            String str;
            
            while ((str = br.readLine())!=null) {
                List<String> l = Arrays.asList(str.split(","));
                funcionarios.add(l);
            }
            
        } catch (Exception e) {System.out.println(e);}
        
        System.out.print("Entre salario: ");
        salario = sc.nextDouble();
        
        System.out.format("Email cujo salario é maior que %.2f:\n", salario);
        List<List<String>> l1 = funcionarios
                .stream()
                .filter(x->Double.valueOf(x.get(2))>salario)
                .collect(Collectors.toList());
        
        l1.forEach((List<String> l) -> {
            System.out.println(l.get(1)); 
        });
        
        System.out.println("Soma dos salarios das pessoas com nomes iniciam com 'M'");
        List<List<String>> l2 = funcionarios
                .stream()
                .filter(x->x.get(0).charAt(0)=='M')
                .collect(Collectors.toList());
        
        List<Double> salariosM = new ArrayList<>();
        l2.forEach((List<String> l) -> {
            salariosM.add(Double.valueOf(l.get(2)));
        });
        
        System.out.format("%.2f\n", salariosM.stream().mapToDouble(Double::doubleValue).sum());
        
    }

}
