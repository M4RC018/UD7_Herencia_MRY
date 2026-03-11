
package a00;

public class Empleado extends Persona {
    private int sueldo;
    private String puesto;

    public Empleado(int edad, String nombre, String nacionalidad, double estatura, int sueldo, String puesto) {
        super(edad, nombre, nacionalidad, estatura);
        this.sueldo = sueldo;
        this.puesto = puesto;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();   // Muestra los datos de Persona
        System.out.println("Sueldo: " + sueldo + " €");
        System.out.println("Puesto: " + puesto);
    }
}
