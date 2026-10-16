
package model;

public class Conta {
    // atributos
    private String nome;
    private String cpf;

    // construtor
    public Conta(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    // getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
