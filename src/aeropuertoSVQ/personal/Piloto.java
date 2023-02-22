package aeropuertoSVQ.personal;

public class Piloto extends Persona {

   Rango rango;
   double sueldo;
   boolean vuelosInternacionales;


   public Piloto() {
   }

   public Piloto(String nombre, String apellidos, String dni, Rango rango, double sueldo, boolean vuelosInternacionales) {
      super(nombre, apellidos, dni);
      this.rango = rango;
      this.sueldo = sueldo;
      this.vuelosInternacionales = vuelosInternacionales;
   }

   public Rango getRango() {
      return rango;
   }

   public void setRango(Rango rango) {
      this.rango = rango;
   }

   public double getSueldo() {
      return sueldo;
   }

   public void setSueldo(double sueldo) {
      this.sueldo = sueldo;
   }

   public boolean isVuelosInternacionales() {
      return vuelosInternacionales;
   }

   public void setVuelosInternacionales(boolean vuelosInternacionales) {
      this.vuelosInternacionales = vuelosInternacionales;
   }

   @Override
   public String toString() {
      return "Piloto{" +
              "rango=" + rango +
              ", sueldo=" + sueldo +
              ", vuelosInternacionales=" + vuelosInternacionales +
              ", nombre='" + nombre + '\'' +
              ", apellidos='" + apellidos + '\'' +
              ", dni='" + dni + '\'' +
              ", email='" + email + '\'' +
              '}';
   }
}
