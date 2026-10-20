package br.edu.fatecfranca.api.models;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "instrutores")
public class Instrutor {

    @Id
    private String id;
    
    private String nome;
    private String especialidade;
    
    // Reutilizando a classe Endereco existente
    private List<Endereco> enderecos;

    public Instrutor() {
        
    }

    public Instrutor(String id, String nome, String especialidade, List<Endereco> enderecos) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.enderecos = enderecos;
    }

    public String getId() {
         return id; 
        }
    public void setId(String id) {
         this.id = id;
         }

    public String getNome() { 
        return nome; 
    }
    public void setNome(String nome) { 
        this.nome = nome;
     }

    public String getEspecialidade() {
        return especialidade;
     }
    public void setEspecialidade(String especialidade) {
         this.especialidade = especialidade;
         }

    public List<Endereco> getEnderecos() { 
        return enderecos; 
    }
    public void setEnderecos(List<Endereco> enderecos) {
         this.enderecos = enderecos; 
        }
}