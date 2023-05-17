package entidades;
import java.util.Date;

public class Reserva {
    private int id;
    private Date fechaReserva;
    private Libro libro;
    private Usuario usuario;

    public Reserva(int id, Date fechaReserva, Libro libro, Usuario usuario) {
        this.id = id;
        this.fechaReserva = fechaReserva;
        this.libro = libro;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getFechaReserva() {
        return fechaReserva;
    }
    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void mostrarInformacion() {
        System.out.println("Reserva ID: " + id);
        System.out.println("Fecha de reserva: " + fechaReserva);
        System.out.println("Libro reservado: " + libro.getTitulo());
        System.out.println("Usuario que realizó la reserva: " + usuario.getNombre());
    }
}
