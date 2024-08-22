package br.com.pedro.unidade1.execicio2.ponto_de_venda;

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

        if (qCadeiras > 0){
            for (int i = 1; i <= qCadeiras; i++) {
                Cadeira cadeira new Cadeira(i);
                if (cadeira.getNumero() !=0){
                    cadeiras.add(cadeira);
                }
            }
        }
    }
    public String getNomeEmpresa(){
        return onibus;
    }

}
