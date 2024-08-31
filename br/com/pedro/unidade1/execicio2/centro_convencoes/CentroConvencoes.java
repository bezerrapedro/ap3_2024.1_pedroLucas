package br.com.pedro.unidade1.execicio2.centro_convencoes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CentroConvencoes {
    private List<Auditorio> auditorios;

    public CentroConvencoes(int auditorioCentros, int capacidadeSala) {
        this.auditorios = new ArrayList<>();
        for (int i = 0; i < auditorioCentros; i++) {
            auditorios.add(new Auditorio(i, capacidadeSala));
        }
    }

    public void resrvarAuditorio(int numeroSala, LocalDateTime date){
        for (Auditorio auditorio : auditorios) {
            if (auditorio.getNumeroSala()== numeroSala){
                auditorio.setOcupado(true);
                auditorio.setDataReserva(date);
            }
        }
    }

    public void listarReservas() {
        for (Auditorio auditorio : auditorios) {
            System.out.println(auditorio);
        }
    }

}
