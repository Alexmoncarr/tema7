package hospital;

public abstract class NoMedico extends TrabajadorHospital{
    Puesto puesto;
    String area;

    public NoMedico() {
    }

    public NoMedico(String nombre, int id, double sueldo, Puesto puesto, String area) {
        super(nombre, id, sueldo);
        this.puesto = puesto;
        this.area = area;
    }

    @Override
    public abstract double calcularSueldo();

    //getters and setters
    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "NoMedico{" +
                "puesto=" + puesto +
                ", area='" + area + '\'' +
                ", nombre='" + nombre + '\'' +
                ", id=" + id +
                ", sueldo=" + sueldo +
                '}';
    }
}
