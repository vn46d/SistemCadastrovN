package Dados;

import BDbyclient.Infconta;

public class Cliente {

    private String nome;
    private String cpf;
    private int idade;
    private String telefone;
    private Infconta.Conta conta;

    public Infconta.Conta getConta() {
        return conta;
    }

    public void setConta(Infconta.Conta conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

        public void setNome(String nome) {
        this.nome = nome;
    }

        public String getCpf() {
        return cpf;
    }

        public void setCpf(String cpf) {
        this.cpf = cpf;
    }

        public int getIdade() {
        return idade;
    }

        public void setIdade(int idade) {
        this.idade = idade;
    }

        public String getTelefone() {
        return telefone;
    }

        public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
