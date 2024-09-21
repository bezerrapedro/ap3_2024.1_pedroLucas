package br.com.pedro.unidade2.exercicio2.restaurante_polimorfismo;

public abstract class Funcionario {
    String nome;
    String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public abstract void trabalhar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + "]";
    }
}
