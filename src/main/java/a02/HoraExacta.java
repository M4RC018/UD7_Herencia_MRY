
package a02;

public class HoraExacta extends Hora{
    int segundo;
    
    public HoraExacta(int hora, int minuto, int segundo){
        super(hora, minuto);
        this.segundo = segundo;
    }
    public boolean setSegundos(int cambiarSegundo){
        if(cambiarSegundo >= 0 && cambiarSegundo < 60){
        segundo = cambiarSegundo;
        return true;
    }
    return false;
    }
    public void inc(){
        segundo ++;
        if(segundo == 60){
            segundo = 0;
            super.inc();
        }
    }
    
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }
    public int getSegundo(){
        return segundo;
    }
}

