package a05;

public abstract class Instrumento {

    protected Nota[] melodia;  
    protected int contador;

    public Instrumento(int capacidad) {
        melodia = new Nota[capacidad];
        contador = 0;
    }

    // Añadir una nota
    public void add(Nota nota) {
        if (contador < melodia.length) {
            melodia[contador++] = nota;
        } else {
            System.out.println("La melodía está llena");
        }
    }

    // Método abstracto que deben implementar las subclases
    public abstract void interpretar();
}