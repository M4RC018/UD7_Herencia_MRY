
package a01;

public class Main {
    public static void main(String[] args) {
        Hora hora;
        hora = new Hora(22, 27);
        hora.inc();
        System.out.println(hora.toString());
        hora.setHora(23);
        hora.setMinutos(59);
        hora.inc();
        System.out.println(hora.toString());
    }
}
