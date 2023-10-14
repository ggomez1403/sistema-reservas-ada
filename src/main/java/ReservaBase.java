import java.util.Date;

public class ReservaBase implements ReservaInterface {
    private String nombre;
    private String documento;
    private String numeroDeContacto;
    private Date fechaYHora;
    private String descripcionReserva;

    public ReservaBase(String nombre, String documento, String numeroDeContacto, Date fechaYHora, String descripcionReserva) {
        this.nombre = nombre;
        this.documento = documento;
        this.numeroDeContacto = numeroDeContacto;
        this.fechaYHora = fechaYHora;
        this.descripcionReserva = descripcionReserva;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public String getNumeroDeContacto() {
        return numeroDeContacto;
    }

    @Override
    public Date getFechaYHora() {
        return fechaYHora;
    }

    @Override
    public String getDescripcionReserva() {
        return descripcionReserva;
    }
}
