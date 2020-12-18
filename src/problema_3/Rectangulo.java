
package problema_3;


public class Rectangulo {
   
    int ancho;
    int alto;

    public Rectangulo (int ancho, int alto) {
        
        this.ancho = ancho;
        this.alto = alto;
    }

    Rectangulo(double random) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    
}

