/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sindinutriagendamento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aline
 */
public class ListaConsulta {
    private static final List<Consulta> lista = new ArrayList<>();
    
    public static List<Consulta> Listar() {
        return lista;
    }
    
    public static void Adicionar(Consulta consulta) {
        lista.add(consulta);
    }

    public static List<Consulta> getLista() {
        return lista;
    }

    public static Iterable<Consulta> getListaConsultas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
