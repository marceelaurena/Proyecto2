
package examenFinal;


public class Radio {
    String audioRadio;
    int encender;
    int apagar;
    
    public Radio(){
    }
    
    public Radio (String audioRadio){
        this.audioRadio = audioRadio;
    }
    public void encender(int encender, int apagar){
        encender=1;
        apagar=2;
    }

    public String getAudioRadio() {
        return audioRadio;
    }

    public void setAudioRadio(String audioRadio) {
        this.audioRadio = audioRadio;
    }

    public int getEncender() {
        return encender;
    }

    public void setEncender(int encender) {
        this.encender = encender;
    }

    public int getApagar() {
        return apagar;
    }

    public void setApagar(int apagar) {
        this.apagar = apagar;
    }
    
}
