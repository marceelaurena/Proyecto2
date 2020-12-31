package examenFinal;

public class ParlanteSubwoofer {

    boolean habilitado = true;
    boolean subirVolumen=true;
    
    public ParlanteSubwoofer() {
    }

    public ParlanteSubwoofer(boolean habilitado) {
   
        this.habilitado = habilitado;
    }

    public void sonarParlante(String audio) {
        
        System.out.println(audio);
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
