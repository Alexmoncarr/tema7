package hospital;
import hospital.Especialidad;

public class Test {
    public static void main(String[] args){

        Trabajador t1 = new Trabajador("Houda", 1123, 1450.0);
        Medico m1 = new Medico ("Enrique", 12345, 2500.0, 123, 0, Especialidad.Cardiologo);
        NoMedico nm1 = new NoMedico ("Tomás", 1234567, 1800, Puesto.Limpiador, "Cardiologia");

        System.out.println(t1.toString());
        System.out.println(m1.toString());
        System.out.println(nm1.toString());
    }
}
