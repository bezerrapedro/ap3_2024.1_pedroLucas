package centro_convencoes;

public class Auditorio {
    private int numeroSala;
    private int capacidade;

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

    @Override
    public String toString() {
        return "Auditorio [numeroSala=" + numeroSala + ", capacidade=" + capacidade + "]";
    }
}
