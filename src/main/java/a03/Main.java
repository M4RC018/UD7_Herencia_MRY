
package a03;

public class Main {
    public static void main(String[] args) {
        HoraExacta horaex1, horaex2;
        horaex1 = new HoraExacta(22, 27, 37);
        horaex2 = new HoraExacta(22, 27, 37);
        
        horaex1.inc();
        horaex1.inc();
        System.out.println(horaex1.toString());
        System.out.println(horaex2.toString());
        
        horaex1.setHora(23);
        horaex2.setMinutos(59);
        horaex1.setSegundos(59);
        horaex2.setHora(22);
        horaex1.setMinutos(45);
        horaex2.setSegundos(45);
        
        
        System.out.println(horaex1.toString());
        System.out.println(horaex2.toString());
        
        System.out.println(horaex1.equals(horaex2));
    }
}

