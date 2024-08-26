package centro_convencoes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CentroConvencoes {
    private List<Auditorio> reservas;

    public CentroConvencoes(int numeroSala, int capacidade) {
        this.reservas = new ArrayList<>();
        
    }

    protected boolean reservarAuditorio(int numeroSala, LocalDate data) {
        for (Auditorio reserva : reservas) {
            System.out.println(reserva);
        }
    }

    public void listarReservas() {
        for (Auditorio reserva : reservas) {
            System.out.println(reserva);
        }
    }

}
