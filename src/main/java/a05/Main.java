package a05;

public class Main {
    public static void main(String[] args) {

        Instrumento instrumento = new Piano(5);

        instrumento.add(Nota.DO);
        instrumento.add(Nota.RE);
        instrumento.add(Nota.MI);
        instrumento.add(Nota.FA);
        instrumento.add(Nota.SOL);

        instrumento.interpretar();
    }
}