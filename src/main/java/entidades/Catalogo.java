package entidades;
import java.util.List;
import java.util.ArrayList;

public class Catalogo {
    private int id;
    private String nombre;
    private List<Libro> libros;
    public Catalogo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Libro> getLibros() {
        return libros;
    }
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    public void mostrarInformacion() {
        System.out.println("Catálogo ID: " + id);
        System.out.println("Nombre del catálogo: " + nombre);
        System.out.println("Libros en el catálogo:");
        for (Libro libro : libros) {
            System.out.println("- " + libro.getTitulo());
        }
    }
}
