
package exemplokeylistener;

/**
keyPressed(KeyEvent e): é invocado quando uma tecla é pressionada.
keyReleased(KeyEvent e): é invocado quando uma tecla é solta.
keyTyped(KeyEvent e): é invocado quando uma tecla foi digitada.
 */

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExemploKeyListener implements KeyListener {

    //Criação da tela e seus componentes
    JFrame frame = new JFrame("Teste de eventos");
    JLabel texto = new JLabel();
    JTextField digitado = new JTextField();
    
    // Método construtor para sempre que "Exemplo()" for chamado iniciarmos com essas configurações
    
    ExemploKeyListener() {
        
        // Configuração da tela e componentes
        frame.add(texto);
        frame.add(digitado);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        texto.setBounds(10,80,300,50);
        digitado.setBounds(70,10,150,20);
        
        // Adicionarmos o ouvinte aos componentes
        digitado.addKeyListener(this);
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource() == digitado) {
            String textoDigitado = digitado.getText();
            int tamanho = textoDigitado.length();
            if(tamanho < 8) {
                texto.setText("Senha fraca");
            } else if ((tamanho >= 8) && (tamanho <= 12)) {
                texto.setText("Senha média");
            } else {
                texto.setText("Senha forte");
            }
        }
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }
    
    
    public static void main(String[] args) {
       new ExemploKeyListener();
    }
    
}
