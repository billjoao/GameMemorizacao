package GameMemorizacao;  

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;

public class GeradorSequencia {
    private static Random random = new Random(); 
    
    public static List<JButton> gerarSequencia(JButton[] botoes, int tamanho) {
        List<JButton> sequencia = new ArrayList<>(); 

        for (int i = 0; i < tamanho; i++) {  
            int indexAleatorio = random.nextInt(botoes.length); 
            sequencia.add(botoes[indexAleatorio]);
        }

        return sequencia; 
    }
}
