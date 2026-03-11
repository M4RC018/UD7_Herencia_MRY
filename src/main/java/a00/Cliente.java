
package a00;

public class Cliente extends Persona {
    private double presupuesto;

    public Cliente(int edad, String nombre, String nacionalidad, double estatura, double presupuesto){
        super(edad, nombre, nacionalidad, estatura);
        this.presupuesto = presupuesto;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();   // Muestra los datos de Persona
        System.out.println("Presupuesto: " + presupuesto + " €");
    }
}