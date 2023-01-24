package atividade1;
import java.util.*;
import java.io.*;

public class Atividade1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Entre com o caminho: ");
        String path = sc.next();
        File file = new File(path);
        Map<String, List<String>> log = new HashMap<>();
        
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(file));
        
            String str;
            
            while ((str = br.readLine())!=null) {
                String user = str.substring(0, str.indexOf(" "));
                String registro = str.substring(str.indexOf(" "), str.length());
                if (log.containsKey(user)) {
                    List<String> l = log.get(user);
                    l.add(registro);
                    log.put(user, l);
                } else {
                    List<String> l = new ArrayList<>();
                    l.add(registro);
                    log.put(user, l);
                }
            }
            
        } catch (Exception e) {System.out.println(e);}
        
        System.out.println("\nQuantidade de Usuários: "+log.size());
        
        System.out.println("\nDados lidos: ");
        for (String p: log.keySet()) {
            System.out.println("\nuser: "+p);
            System.out.println("logs de entrada: ");
            System.out.println(log.get(p));
        }

    }

}
