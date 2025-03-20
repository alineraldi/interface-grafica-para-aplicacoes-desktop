/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sindinutriagendamento;

/**
 *
 * @author aline
 */
public class Consulta {
    private String nomePaciente;
    private String CPFPaciente;
    private String telefonePaciente;
    private String dataConsulta;
    private boolean jaEraPaciente;
    private boolean consultaRealizada;

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getCPFPaciente() {
        return CPFPaciente;
    }

    public void setCPFPaciente(String CPFPaciente) {
        this.CPFPaciente = CPFPaciente;
    }

    public String getTelefonePaciente() {
        return telefonePaciente;
    }

    public void setTelefonePaciente(String telefonePaciente) {
        this.telefonePaciente = telefonePaciente;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public boolean isJaEraPaciente() {
        return jaEraPaciente;
    }

    public void setJaEraPaciente(boolean jaEraPaciente) {
        this.jaEraPaciente = jaEraPaciente;
    }

    public boolean isConsultaRealizada() {
        return consultaRealizada;
    }

    public void setConsultaRealizada(boolean consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }
    
    
}
