
package a05;

public class Piano extends Instrumento {

    public Piano(int capacidad){
        super(capacidad);
    }

    @Override
    public void interpretar() {
        System.out.print("Piano interpretando: ");
        for(int i = 0; i < contador; i++) {
            System.out.print(melodia[i] + " ");
        }
        System.out.println(); // salto de línea
    }
}
