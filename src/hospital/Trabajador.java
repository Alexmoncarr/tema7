package hospital;

public class Trabajador {
    protected String nombre;
    protected int id;
    protected double sueldo;

    public Trabajador() {
    }

    public Trabajador(String nombre, int id, double sueldo) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", sueldo=" + sueldo +
                '}';
    }
}
