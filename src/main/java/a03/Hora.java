
package a03;

public class Hora {
    public int hora;
    public int minuto;
    
    public Hora(int hora, int minuto){
    if(hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60){
        this.hora = hora;
        this.minuto = minuto;
    }else{
        this.hora = 00;
        this.minuto = 00;
    }
}
    public void inc(){
        minuto++;

        if(minuto == 60){
            minuto = 00;
            hora++;
        }

        if(hora == 24){
            hora = 00;
        }
    }
    public boolean setMinutos(int cambioMinuto){
    if(cambioMinuto >= 0 && cambioMinuto < 60){
        minuto = cambioMinuto;
        return true;
    }
    return false;
}
    public boolean setHora(int cambioHora){
        if (cambioHora >= 0 && cambioHora < 24){
            hora = cambioHora;
            return true;
        }
        return false;
    }
    @Override 
    public String toString(){
        String cad;
        cad = getHora() + ":" + getMinuto();
        return cad;
    }
    protected int getHora(){
        return hora;
    }
    protected int getMinuto(){
        return minuto;
    }
}
