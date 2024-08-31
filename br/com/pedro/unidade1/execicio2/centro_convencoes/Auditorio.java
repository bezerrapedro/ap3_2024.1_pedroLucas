package br.com.pedro.unidade1.execicio2.centro_convencoes;

import java.time.LocalDateTime;

public class Auditorio {

    private int numeroSala;
    private int capacidade;
    private boolean ocupado;
    private LocalDateTime dataReserva;

    public Auditorio(int numeroSala, int capacidade) {
        this.numeroSala = numeroSala;
        this.capacidade = capacidade;

    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public LocalDateTime getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDateTime dataReserva) {
        this.dataReserva = dataReserva;
    }

    @Override
    public String toString() {
        return "Auditorio [numeroSala=" + numeroSala + ", capacidade=" + capacidade + ", ocupado=" + ocupado
                + ", dataReserva=" + dataReserva + "]";
    }

}
