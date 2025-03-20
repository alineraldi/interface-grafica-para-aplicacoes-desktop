package portalaluno.model;

import java.util.ArrayList;
import java.util.List;

public class ListaAluno {
    //Declaração de variáveis
    private static final List<Aluno> lista = new ArrayList<>();
    // private: Se fosse public, qualquer classe poderia acessar e modificar a lista livremente, o que pode ser perigoso.
    // static: Todas as instâncias da classe compartilham a mesma lista de alunos.
    // final: Isso evita que alguém sobrescreva a lista inteira por engano, mantendo consistência no código
    
    public static List<Aluno> Listar() {
        return lista;
    }
    
    public static void Adicionar(Aluno aluno) {
        lista.add(aluno);
    }
    
}
