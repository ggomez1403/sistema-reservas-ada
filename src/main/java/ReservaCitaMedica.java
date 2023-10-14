import java.util.Date;

public class ReservaCitaMedica extends ReservaBase{
    public ReservaCitaMedica(String nombre, String documento, String numeroDeContacto, Date fechaYHora, String descripcionReserva) {
        super(nombre, documento, numeroDeContacto, fechaYHora, descripcionReserva);
    }
}
