package br.com.pedro.unidade2.exercicio2.restaurante_polimorfismo;

public class AuxiliarCozinha extends Funcionario {
    public Estacao estacao;

    public AuxiliarCozinha(String nome, String cargo, Estacao estacao) {
        super(nome, cargo);
        this.estacao = estacao;
    }

    public void trabalhar() {
        System.out.println("O "+ cargo + nome + " esta fritando Coxinha");
    }

    public Estacao getEstacao() {
        return estacao;
    }

    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }

    @Override
    public String toString() {
        return "AuxiliarCozinha [estacao=" + estacao + "]";
    }

}
