package br.edu.fatecfranca.api.models;

public class Nota {

    private Double valor;
    private String descricao;

    public Nota() {
        
    }

    public Nota(Double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public Double getValor() {
         return valor; 
        }
    public void setValor(Double valor) { 
        this.valor = valor; 
    }

    public String getDescricao() {
         return descricao;
         }
    public void setDescricao(String descricao) {
         this.descricao = descricao;
         }
}