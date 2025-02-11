/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplomouselistener;

/**
mouseClicked(MouseEvent e): é invocado quando o botão do mouse é clicado (pressionado e liberado) em um componente.
mouseEntered(MouseEvent e): é invocado quando o mouse entra em um componente.
mouseExited(MouseEvent e): é invocado quando o mouse sai de um componente.
mousePressed(MouseEvent e): é invocado quando um botão do mouse é pressionado em um componente.
mouseReleased(MouseEvent e): é invocado quando um botão do mouse é liberado em um componente.
 */

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ExemploMouseListener implements MouseListener {

    // Criação da tela e componentes
    JFrame frame = new JFrame("Teste de eventos");
    JLabel texto = new JLabel();
    JButton botao = new JButton("Clique");
    
    // Construtor
    
    ExemploMouseListener() {
        frame.add(texto);
        frame.add(botao);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        texto.setBounds(10,80,300,50);
        botao.setBounds(100,10,100,30);
        
        // Adicionar o listener aos componentes
        botao.addMouseListener(this);
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        if(e.getSource()== botao) {
            texto.setText("Você clicou com o mouse!");
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e){
        if(e.getSource() == botao) {
            texto.setText("Você pressionou com o mouse.");
        }
    }
    
    @Override
    public void mouseEntered(MouseEvent e){
        if(e.getSource() == botao) {
            texto.setText("Você está sobre o botão com o mouse.");
        }
    }
    
    @Override
    public void mouseExited(MouseEvent e){
        
    }
    
    @Override
    public void mouseReleased(MouseEvent e){
        
    }
    
    public static void main(String[] args) {
        new ExemploMouseListener();
    }
    
}
