
package jappexamplelist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JAppExampleList {

  

    public static void main(String[] args) {
            // Definir a lista
    List<String> namesList = new ArrayList<>();
    // Criar variável que controla a parada da aplicação, opção que será digitada pelo usuário
    int option;
    // Criar objeto 'keyboard' (entrada)
    Scanner keyboard = new Scanner(System.in);
    // Criar estrutura de repetição para manter a aplicação rodando
    do {
    // Exibir opções para o usuário poder escolher
            System.out.println("\nTrabalhando com List\n");
            System.out.println("1. Inserir nome");
            System.out.println("2. Verificar nome");
            System.out.println("3. Remover nome");
            System.out.println("4. Listar todos os nomes");
            System.out.println("5. Sair\n");
    // Ler opção digitada pelo usuário
            System.out.println("Digite sua opção [1 a 5]: ");
            option = keyboard.nextInt();
    // Criar o seletor da opção digitada pelo usuário
            switch (option) {
                case 1:
                    System.out.println("\nINSERIR NOME\n");
                    // Para inserir o nome na lista vamos usar o método "add(String name)",
                    // passando como parâmetro a string digitada pelo usuário.
                    // Como esse método retorna 'true' se inserido e 'false' se não inserido, 
                    // vamos aproveitar para emitir uma mensagem de inserido com sucesso ou não.
                    // Para termos um certo padrão vamos deixzr os nomes com todas as letras maiusculas usando o método toUpperCase().
                    System.out.println("Digite o nome: ");
                    boolean foiInserido = namesList.add(keyboard.next().toUpperCase());
                        
                    if(foiInserido){
                        System.out.println("Nome inserido");
                    } else{
                        System.out.println("FALHA: Nome não inserido.");
                    }
                    break; // por quê o break? → O break é necessário para evitar que o código continue executando os próximos case
                case 2:
                     System.out.println("\nVERIFICAR NOME\n");
                     // Aqui vamos buscar um nome na lista, mas é interessante começar
                     // verificando se a lista está vazia. Para isso, utilizamos o método isEmpty().
                    if(namesList.isEmpty()){
                        System.out.println("ATENÇÃO: Não há nomes na lista.");
                    } else {
                        System.out.println("Digite o nome a ser localizado: ");
                        // Criando uma variável para acessar o nome a ser encontrado
                    }   String name = keyboard.next().toUpperCase();
                    if(namesList.contains(name)){ // contains: método de List
                        // Se for encontrado, vamos exibir o nome e posição onde foi encontrado
                        // Para isso, usamos o método indexOfObject(Object o),
                        // que retorna a posição em que o nome foi encontrado.
                    int position = namesList.indexOf(name);
                    System.out.println("Nome: " + name + " | Posição: " + position + " da list");
                    } else {
                        // Se false, se não for encontrado
                        System.out.println("ATENÇÃO - Nome não encontrado na lista");
                    }
                    break;
                    
                case 3: 
                    System.out.println("\nREMOVER NOME\n");
                    // Antes de tudo, é importante verificar se a lista está vazia.
                    if(namesList.isEmpty()){
                        System.out.println("ATENÇÃO: Não há nomes na lista.");
                    } else {
                        // Se false, precisamos pedir para o usuário o nome a ser removido da lista
                        // O método responsável por isso é o remove(Object o)
                        // Esse método retorna true quando remove o objeto, e false quando não remove
                         // Vamos criar uma variável para armazenar o nome a ser encontrado
                        System.out.println("Digite o nome a ser deletado: ");
                        name = keyboard.next().toUpperCase();
                        
                        if(namesList.remove(name)){
                           // Se true - foi deletado
                            System.out.println("Nome: " + name + " - Removido com sucesso.");
                        } else {
                            // Se false - não foi encontrado
                            System.out.println("ATENÇÃO! Nome não encontrado na lista.");
                        }
                    }
                    break;
                case 4:
                    // Aqui, vamos listar todos os nomes da lisra
                    System.out.println("\nLISTAR TODOS OS NOMES\n");
                    // Antes de listar os nomes, é prudente verificar se a lista não está vazia
                    if(namesList.isEmpty()) {
                        System.out.println("ATENÇÃO - Não há nomes na lista.");
                    } else {
                        // Vamos usar um loop for para iterar sobre todos os elementos da lista.
                        // Para saber quando parar, usamos o método size() que retorna o número de elementos que tem na lista
                        // Para pegar um elemento da lista usamos o método get(int index), que retorna o objeto da posição informada como parâmetro
                        
                        for (int i=0; i < namesList.size(); i++) {
                            name = namesList.get(i);
                            System.out.println("Posição " + i + ": " + name);
                        }
                   }
                    break;
                case 5:
                    System.out.println("OBRIGADO POR UTILIZAR NOSSO APLICATIVO - SENAC EAD");
                    break;
                    
                default:
                    // Caso o usuário digite algum valor diferente das opções do menu
                    System.out.println("ATENÇÃO! Opção inválida!");
                    break;
        }
            
        } while (option != 5);
    
        keyboard.close();
    }
}
    
