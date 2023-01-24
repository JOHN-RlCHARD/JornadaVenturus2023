package atividade2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Stream;

public class Atividade2 {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Entre com o caminho: ");
        String path = sc.next();
        File file = new File(path);
        Map<String, Double> produtos = new HashMap<>();
        List<String> abaixoMedia = new ArrayList<>();
        Double media = 0.0;
        
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(file));
        
            String str;
            
            while ((str = br.readLine())!=null) {
                String nome = str.substring(0, str.indexOf(","));
                String precoStr = str.substring(str.indexOf(",")+1, str.length());
                Double preco = Double.valueOf(precoStr);
                produtos.put(nome, preco);
                media+=preco;
            }
            
        } catch (Exception e) {System.out.println(e);}
        
        media/=produtos.size();
        
        for (String p: produtos.keySet()) {
            if (produtos.get(p)<=media) abaixoMedia.add(p);
        }
        
        Stream<String> st1 = abaixoMedia.stream().sorted((s1, s2) -> s2.compareTo(s1));
        st1.forEach(System.out::println);
    }

}
