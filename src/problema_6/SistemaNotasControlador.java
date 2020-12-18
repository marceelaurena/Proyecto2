
package problema_6;


public class SistemaNotasControlador {
    public static void main (String []args){
        boolean modoGrafico = true;
        boolean modoInteractivo = true;
        int modo = 0;
    SistemaNotasControlador c = new SistemaNotasControlador();
    SistemaNotasReporte a = new SistemaNotasReporte();
    SistemaNotasInterfaz b = new SistemaNotasInterfaz(a, modoGrafico, modoInteractivo);
    
    switch (modo){
        case 1: b.notasExamen();
        break;
        
        
    }
    
}}
