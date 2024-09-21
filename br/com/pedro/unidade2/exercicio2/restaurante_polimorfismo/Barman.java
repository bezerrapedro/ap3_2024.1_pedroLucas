package br.com.pedro.unidade2.exercicio2.restaurante_polimorfismo;

public class Barman extends Funcionario {
    String especialidade;

    public Barman(String nome, String cargo, String especialidade) {
        super(nome, cargo);
        this.especialidade = especialidade;
    }

    public void trabalhar() {
        System.out.println(
                "o " + cargo + " " + nome + " com especialidade em " + especialidade + " esta fazendo sua bebida");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Barman [especialidade=" + especialidade + "]";
    }

}
