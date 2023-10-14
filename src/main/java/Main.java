import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Ejemplo reserva de Hotel
        ReservaHotel reservaHotel = new ReservaHotel("Geraldine Gomez", "12345", "11111", new Date(), "Hotel Ritz, Habitación Doble");

        System.out.println("-------------------------------------------------------");
        System.out.println("Reserva Hotel");
        System.out.println("-------------------------------------------------------");

        System.out.println("Nombre del cliente: " + reservaHotel.getNombre());
        System.out.println("Fecha de reserva: " + reservaHotel.getFechaYHora());
        System.out.println("Descripcion de la reserva: " + reservaHotel.getDescripcionReserva());

        // Ejemplo reserva cita medica
        ReservaCitaMedica reservaCitaMedica = new ReservaCitaMedica("Maria Lopez", "987654321", "555-987-6543", new Date(), "Consulta con el Dr. Gomez");

        System.out.println("-------------------------------------------------------");
        System.out.println("Reserva Cita Medica");
        System.out.println("-------------------------------------------------------");

        System.out.println("Nombre del cliente: " + reservaCitaMedica.getNombre());
        System.out.println("Fecha de reserva: " + reservaCitaMedica.getFechaYHora());
        System.out.println("Descripcion de la reserva: " + reservaCitaMedica.getDescripcionReserva());

        // Ejemplo reserva restaurante
        ReservaRestaurante reservaRestaurante = new ReservaRestaurante("Ana Torres", "456789012", "555-789-0123", new Date(), "Mesa para dos en La Brasserie");
        System.out.println("-------------------------------------------------------");
        System.out.println("Reserva Restaurante");
        System.out.println("-------------------------------------------------------");

        System.out.println("Nombre del cliente: " + reservaRestaurante.getNombre());
        System.out.println("Fecha de reserva: " + reservaRestaurante.getFechaYHora());
        System.out.println("Descripcion de la reserva: " + reservaRestaurante.getDescripcionReserva());

    }
}
