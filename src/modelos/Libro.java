package modelos;

public class Libro {
    private int cod;
    private String Nombre;
    private String ISBN;
    private int editorial;
    private int anio;

    public Libro() {
    }

    public Libro(int cod, String Nombre, String ISBN, int editorial, int anio) {
        this.cod = cod;
        this.Nombre = Nombre;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.anio = anio;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getEditorial() {
        return editorial;
    }

    public void setEditorial(int editorial) {
        this.editorial = editorial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
}
