package a00;

public class Persona {
    private final int edad; 
    private String nombre;    
    private String nacionalidad;
    private double estatura;

    
    public Persona(int edad, String nombre, String nacionalidad, double estatura){
        this.edad = edad;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.estatura = estatura;
    }

    
    public void mostrarDatos(){
        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Estatura: " + estatura + " m");
    }

   
    public boolean esMayorEdad(){ 
        return edad >= 18; 
    }

    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    
    public static void main(String[] args) {
        
        Persona p1 = new Persona(19, "Jose", "Española", 1.75);
        Persona p2 = new Empleado(30, "Ana", "Española", 1.65, 3000, "Jefe");
        Persona p3 = new Cliente(25, "Luis", "Española", 1.80, 1500);

        
        Persona[] personas = {p1, p2, p3};

        for (Persona p : personas) {
            System.out.println("-----");
            p.mostrarDatos();  
        }
    }
}