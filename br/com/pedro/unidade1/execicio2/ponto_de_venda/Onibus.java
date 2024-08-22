package br.com.pedro.unidade1.execicio2.ponto_de_venda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Onibus {
    private String onibus;
    private List<Cadeira> cadeiras;
    private List<Reserva> reservas;

    public Onibus(String onibus, int qCadeiras) {
        this.reservas = new ArrayList<>();
        this.cadeiras = new ArrayList<>();
        this.onibus = onibus;

        if (qCadeiras > 0) {
            for (int i = 1; i <= qCadeiras; i++) {
                Cadeira cadeira = new Cadeira(i);
                if (cadeira.getNumero() != 0) {
                    cadeiras.add(cadeira);
                }
            }
        }
    }

    public String getNomeEmpresa() {
        return onibus;
    }

    protected boolean cadastraReserva(String cliente, int numeroCadeira, LocalDateTime horario) {
        if (numeroCadeira < 1 || numeroCadeira > cadeiras.size()) {
            System.err.println(
                    "Erro: Cadeira " + numeroCadeira + "inválido, escolha 1 e " + cadeiras.size() + ".");
            return false;
        }
        for (Cadeira cadeira : cadeiras) {
            if (cadeira.getNumero() == numeroCadeira) {
                if (cadeira.isOcupado()) {
                    System.err.println("Erro: Cadeira " + numeroCadeira + " ocupada.");
                    return false;
                }
                cadeira.setOcupado(true);
                reservas.add(new Reserva(cliente, cadeira, horario));
                return true;
            }
        }
        System.err.println("Erro: Cadeira " + numeroCadeira + " não encontrada.");
        return false;
    }

    protected void listarReservas() {
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }

    public void listarCadeiras() {
        for (Cadeira cadeira : cadeiras) {
            System.out.println(cadeira);
        }
    }
}
