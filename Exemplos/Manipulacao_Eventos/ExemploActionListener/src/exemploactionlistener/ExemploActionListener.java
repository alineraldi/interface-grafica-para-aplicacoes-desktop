/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploactionlistener;

  import java.awt.event.ActionEvent;
  import java.awt.event.ActionListener;
  import javax.swing.JButton;
  import javax.swing.JFrame;
  import javax.swing.JLabel;

  public class ExemploActionListener implements ActionListener {
      
      // Criação da tela e seus componentes
      JFrame frame = new JFrame("Teste de eventos");
      JLabel texto = new JLabel();
      JButton botao = new JButton("Clique");

      // Método construtor para sempre que "Exemplo()" for chamado iniciarmos com essas configurações
      ExemploActionListener() {
          
          // Configuração da tela e seus componentes
          frame.add(texto);
          frame.add(botao);
          frame.setSize(300,300);
          frame.setLayout(null);
          frame.setVisible(true);  
          texto.setBounds(10,80, 300,50);    
          botao.setBounds(100,10, 100,30);    
          
          
          // Adicionarmos o ouvinte aos componentes
          botao.addActionListener(this);
      }
      
      @Override
      public void actionPerformed(ActionEvent e) {
          if(e.getSource() == botao) {
              System.out.println(e.getSource());
              texto.setText("O botão foi pressionado!");
          } 
      }
      
      // Executamos o projeto
      public static void main(String[] args) {
          new ExemploActionListener();
      }   
  }
