package br.edu.fatecfranca.api.models;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class Horario {

    private static final String FORMATO_HORA = "^([01]\\d|2[0-3]):[0-5]\\d$";

    @NotBlank(message = "O dia da semana é obrigatório.")
    private String diaDaSemana;

    @NotBlank(message = "O horário de início é obrigatório.")
    @Pattern(regexp = "^([01]\\d|2[0-3]):[0-5]\\d$", message = "O horário de início deve estar no formato HH:mm.")
    private String horaInicio;

    @NotBlank(message = "O horário de término é obrigatório.")
    @Pattern(regexp = "^([01]\\d|2[0-3]):[0-5]\\d$", message = "O horário de término deve estar no formato HH:mm.")
    private String horaFim;

    public Horario() {
        
    }

    @JsonIgnore
    @AssertTrue(message = "O horário de término deve ser posterior ao horário de início.")
    public boolean isPeriodoValido() {
        if (!horarioValido(horaInicio) || !horarioValido(horaFim)) return true;
        return LocalTime.parse(horaFim).isAfter(LocalTime.parse(horaInicio));
    }

    private boolean horarioValido(String horario) {
        if (horario == null || !horario.matches(FORMATO_HORA)) return false;
        try {
            LocalTime.parse(horario);
            return true;
        } catch (DateTimeParseException exception) {
            return false;
        }
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