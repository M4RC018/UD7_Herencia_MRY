
package a02;

public class Main {
    public static void main(String[] args) {
        HoraExacta horaex;
        horaex = new HoraExacta(22, 27, 37);
        
        horaex.inc();
        System.out.println(horaex.toString());
        
        horaex.setHora(23);
        horaex.setMinutos(59);
        horaex.setSegundos(59);
        
        horaex.inc();
        System.out.println(horaex.toString());
    }
}
