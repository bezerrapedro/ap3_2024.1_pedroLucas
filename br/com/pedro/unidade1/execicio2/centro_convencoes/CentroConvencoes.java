package centro_convencoes;

import java.time.LocalDate;
import java.util.ArrayList; 
import java.util.List;

public class CentroConvencoes {
    private List<Reserva> reservas;

    protected boolean reservarAuditorio(int numeroSala, LocalDate data){
        for (Reserva reserva : reservas) {
            
        }
    }

    public void listarReservas() {
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }



}
