package a04;

public abstract class Instrumento {

    protected Nota[] melodia;  // 👈 este nombre debe coincidir
    protected int contador;

    public Instrumento(int capacidad) {
        melodia = new Nota[capacidad];
        contador = 0;
    }

    public void add(Nota nota) {
        if (contador < melodia.length) {
            melodia[contador++] = nota;
        }
    }

    public abstract void interpretar();
}