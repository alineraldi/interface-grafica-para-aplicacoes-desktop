/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExemploItemListener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ExemploItemListener implements ItemListener {
    
    
    //Criação da tabela e componentes
    JFrame frame = new JFrame("Teste de eventos");
    JLabel texto = new JLabel();
    JRadioButton checkBox1 = new JRadioButton("Checkbox 1");
    JRadioButton checkBox2 = new JRadioButton("Checkbox 2");
    
    // Construtor
    public ExemploItemListener() {
        
        //Configuração da tela e componentes
        frame.add(texto);
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        texto.setBounds(10,80,300,50);
        checkBox1.setBounds(100,12,150,50);
        checkBox2.setBounds(100,50,150,50);
        
        //Adicionar o ouvinte aos componentes
        checkBox1.addItemListener(this);
        checkBox2.addItemListener(this);
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == checkBox1) {
            texto.setText("Status da CheckBox 1 mudou para " + e.getStateChange());
        }
        
        if(e.getSource() == checkBox2) {
            texto.setText("Status da CheckBox 2 mudou para " + e.getStateChange());
        }
    }
    
    //Executando
    public static void main(String[] args) {
        new ExemploItemListener();
    }
}
