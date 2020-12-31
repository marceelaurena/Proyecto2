package examenFinal;

public class ParlantePequeno {

    int tipoParlante;
    boolean habilitado=true;
    boolean subirVolumen=true;
    
    public ParlantePequeno() {
    }

    public ParlantePequeno(int tipoParlante, boolean habilitado) {
        this.tipoParlante = tipoParlante;
        this.habilitado = habilitado;
    }

    public void sonarParlante(String audio) {
        
        System.out.println(audio);
    }

    public int getTipoParlante() {
        return tipoParlante;
    }


    public void setTipoParlante(int tipoParlante) {
        this.tipoParlante = tipoParlante;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public boolean isSubirVolumen() {
        return subirVolumen;
    }

    public void setSubirVolumen(boolean subirVolumen) {
        this.subirVolumen = subirVolumen;
    }
    
   

}
