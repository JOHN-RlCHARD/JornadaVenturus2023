package horadosistema;
import java.awt.*;
import java.util.Date;

public class HoraDoSistema {
    public static void main(String[] args) {

        //EXERCICIO 1
        Date relogio = new Date();
        System.out.println("A hora do sistema é:");
        System.out.println(relogio.toString());
        
        //DESAFIO 1
        String userCountry = System.getProperty("user.country");
        String userLanguage = System.getProperty("user.language");
        System.out.println("O idioma do seu computador é "+userLanguage+"-"+userCountry);
        
        //DESAFIO 2
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Double width = screenSize.getWidth();
        Double height = screenSize.getHeight();
        System.out.println("A resolução da sua tela é "+width.intValue()+"x"+height.intValue());
        
    }
    
}
