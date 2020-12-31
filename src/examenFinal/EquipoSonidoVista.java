package examenFinal;

import java.util.Scanner;

public class EquipoSonidoVista {

    Scanner entrada = new Scanner(System.in);
    ParlantePequeno p;
    ParlanteSubwoofer ps;
    Radio rad;

    EquipoSonidoVista(EquipoSonido eS) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setHabilitarParlante(int tipoParlante, boolean habilitar) {
        System.out.println("Digite tipo de parlante: Pequeno derecho==1, Pequeno Izquierdo==2, Subwoofer==3");
        tipoParlante = entrada.nextInt();
        System.out.println("Desea mantenerlo habilitado? Si==true, No==false");
        habilitar = entrada.nextBoolean();
    }
    public void setAjustarVolumen(int tipoParlante, boolean subir) {
        System.out.println("Digite tipo de parlante: Pequeno derecho==1, Pequeno Izquierdo==2, Subwoofer==3");
        tipoParlante = entrada.nextInt();
        System.out.println("Desea subir el volumen? Si==true, No==false");
        subir = entrada.nextBoolean();
    }
    public void setElegirReproductor(int elegirReproductor){
        System.out.println("Elija que desea reproducir: Lista de audios == 1, Radio == 2");
        elegirReproductor = entrada.nextInt();
    }
}
