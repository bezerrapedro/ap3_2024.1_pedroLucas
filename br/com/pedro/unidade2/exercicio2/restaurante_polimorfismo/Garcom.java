package br.com.pedro.unidade2.exercicio2.restaurante_polimorfismo;

public class Garcom extends Funcionario {

    double valorGorjeta;

    public Garcom(String nome, String cargo, double valorGorjeta) {
        super(nome, cargo);
        this.valorGorjeta = valorGorjeta;
    }

    public void trabalhar() {
        System.out.println("estou servindo um cliente");
    }

    public double getValorGorjeta() {
        return valorGorjeta;
    }

    public void setValorGorjeta(double valorGorjeta) {
        this.valorGorjeta = valorGorjeta;
    }

    @Override
    public String toString() {
        return "Garcom [valorGorjeta=" + valorGorjeta + "]";
    }
}
