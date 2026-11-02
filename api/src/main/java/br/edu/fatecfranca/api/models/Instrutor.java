package br.edu.fatecfranca.api.models;

import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "instrutores")
public class Instrutor {

    @Id
    private String id;

    @NotBlank(message = "O nome é obrigatório.")
    private String nome;

    @NotBlank(message = "O CPF é obrigatório.")
    @CPF(message = "O CPF informado é inválido.")
    private String cpf;

    private String telefone;

    @NotBlank(message = "O e-mail é obrigatório.")
    @Email(message = "O e-mail informado é inválido.")
    private String email;
    
    @NotEmpty(message = "O instrutor deve possuir ao menos uma especialidade.")
    private String especialidade;

    @NotEmpty(message = "O instrutor deve possuir ao menos um endereço.")
    private List<@Valid Endereco> enderecos;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}