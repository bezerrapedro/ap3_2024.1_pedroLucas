package br.com.pedro.unidade1.execicio2.ponto_de_venda;

public class Cadeira {
    private int numero;
    private boolean ocupado;

    public Cadeira(int numero) {
        this.numero = numero;
        this.ocupado = false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getOcupado() {
        return ocupado ? "Ocupado" : "Livre";
    }

    public String getNumeroFormatado() {
        return String.format("%02d", numero);
    }

    @Override
    public String toString() {
        return "Cadeira " + getNumeroFormatado() + "->" + getOcupado();
    }

}
