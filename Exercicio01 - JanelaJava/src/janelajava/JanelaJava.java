package janelajava;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaJava {

    public static void main(String[] args) {
        JFrame janela = new JFrame(); // cria o objeto janela
        janela.setSize(300, 200); // ajusta o tamanho da janela para largura de 300 pixels e altura de 200 pixels.
        janela.setTitle("Minha primeira janela!"); // permite que se configure um título para aparecer na barra superior da tela.
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define o que o programa deve fazer quando se clicar no botão X. o padrão é só esconder a janela
        janela.setLayout(new FlowLayout());
        
        
        // criando label
        JLabel rotulo = new JLabel();
        rotulo.setText("Digite seu nome: ");
        janela.add(rotulo);
        
        //criando campo de entrada
        JTextField campo = new JTextField(10); // 10: colunas - medida para definir a largura do campo
        janela.add(campo);
        
        // criando botão
        JButton botao = new JButton();
        botao.setText("Clique aqui!");
        janela.add(botao);
        
        botao.addActionListener(new AcaoBotao(campo));
        
        janela.setVisible(true); // torna a janela visível. se não houver esta linha de código, a janela não aparecerá na tela.
        
    }
    
}
