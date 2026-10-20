package br.edu.fatecfranca.api.models;

public class Horario {

    private String diaDaSemana;
    private String horaInicio;
    private String horaFim;

    public Horario() {
        
    }

    public Horario(String diaDaSemana, String horaInicio, String horaFim) {
        this.diaDaSemana = diaDaSemana;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public String getDiaDaSemana() { 
        return diaDaSemana; 
    }
    public void setDiaDaSemana(String diaDaSemana) {
         this.diaDaSemana = diaDaSemana; 
        }

    public String getHoraInicio() { 
        return horaInicio; 
    }
    public void setHoraInicio(String horaInicio) {
         this.horaInicio = horaInicio; 
        }

    public String getHoraFim() { 
        return horaFim;
    }
    public void setHoraFim(String horaFim) { 
        this.horaFim = horaFim; 
    }
}