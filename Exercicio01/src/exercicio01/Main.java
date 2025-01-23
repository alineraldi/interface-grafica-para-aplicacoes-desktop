package exercicio01;

import javax.swing.JOptionPane;

public class Main {

    
    //Janelas iniciais
    public static void main(String[] args) {
        
    //Variaveis
    Double peso;
    Double altura;
    Double imc;
    String nome;
    String mensagem = "";
    
    //Janelas iniciais
        
    JOptionPane.showMessageDialog(null, "Olá\nVamos calcular a melhor dieta para você!");
    nome = JOptionPane.showInputDialog("Digite seu nome: ");
    peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso em kg: "));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura em cm:"));
    
    // Cálculo
    imc = peso/(altura/100 * altura/100);
    if (imc < 18.5) {
        mensagem = nome+" Baixo peso(grau I)";
    }else if (imc < 24.9) {
        mensagem = nome+" Normal (?)";
    }else if (imc < 29.9) {
        mensagem = nome+" Sobrepeso";
    }else if (imc < 34.9) {
        mensagem = nome+" Obeso grau I";
    }else if (imc < 39.9) {
        mensagem = nome+ " Obeso grau II";
    }else {
        mensagem = nome+ " Obeso grau III ou mórbido";
    }
    
    JOptionPane.showMessageDialog(null, mensagem);
    
   }
}
