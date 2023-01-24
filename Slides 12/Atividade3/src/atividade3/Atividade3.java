package atividade3;
import java.util.*;
import java.io.*;

public class Atividade3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Entre com o caminho: ");
        String path = sc.next();
        File file = new File(path);
        Map<String, Integer> treeMap = new TreeMap<>();
        
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(file));
        
            String str;
            
            while ((str = br.readLine())!=null) {
                String candidato = str.substring(0, str.indexOf(","));
                String votosStr = str.substring(str.indexOf(",")+1, str.length());
                Integer votos = Integer.valueOf(votosStr);
                if (treeMap.containsKey(candidato)) {
                    Integer qtd = treeMap.get(candidato);
                    treeMap.put(candidato, (qtd+votos));
                } else {
                    treeMap.put(candidato, votos);
                }
            }
            
        } catch (Exception e) {System.out.println(e);}
        
        System.out.println("\n*** RELATORIO DA VOTACAO ***");
        
        for (String p: treeMap.keySet()) {
            System.out.print(p+": "+treeMap.get(p)+"\n");
        }
        
    }

}
