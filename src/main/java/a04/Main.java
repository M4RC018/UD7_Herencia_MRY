package a04;

public class Main {
    public static void main(String[] args) {

        Instrumento instrumento = new Instrumento(5) {
            @Override
            public void interpretar() {
                System.out.print("Interpretando: ");
                for (int i = 0; i < contador; i++) {
                    System.out.print(melodia[i] + " ");
                }
                System.out.println();
            }
        };

        instrumento.add(Nota.DO);
        instrumento.add(Nota.RE);
        instrumento.add(Nota.MI);

        instrumento.interpretar();
    }
}
