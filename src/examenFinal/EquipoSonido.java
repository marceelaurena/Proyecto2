package examenFinal;

public class EquipoSonido {

    String[] listaAudios = new String[1000];
    int cantidadAudios = 0;
    int elegirReproductor;
    ParlantePequeno derecho;
    ParlantePequeno izquierdo;
    ParlanteSubwoofer subwoofer;
    Radio rad;
    Reloj re;

    public EquipoSonido() {
        for (int i = 0; i < 1000; i++) {
            listaAudios[i] = "";
        }
    }

    public void agregar(String audio) {
        listaAudios[cantidadAudios] = audio;
        cantidadAudios++;
    }

    public void eliminar(int posicion) {
        listaAudios[posicion] = "";
        cantidadAudios--;
    }

    public void menuAudios(String[] listaAudios) {
        int reproduccion = 0;
        switch (reproduccion) {
            case 1:
                for (int i = 0; i < listaAudios.length; i++) {
                    System.out.println(listaAudios[i]);
                }
                break;
            case 2:
                for (int i = 0; i < listaAudios.length; i++) {
                    System.out.println(listaAudios[i - 1]);
                }
                break;
        }
    }

    public void habilitarParlante(boolean habilitar, int tipoParlante) {
        if (tipoParlante == 1 && habilitar == true) {
            this.derecho.setHabilitado(true);
        } else if (tipoParlante == 1 && habilitar == false) {
            this.derecho.setHabilitado(false);
        } else if (tipoParlante == 2 && habilitar == true) {
            this.izquierdo.setHabilitado(true);
        } else if (tipoParlante == 2 && habilitar == false) {
            this.izquierdo.setHabilitado(false);
        } else if (tipoParlante == 3 && habilitar == true) {
            this.subwoofer.setHabilitado(true);
        } else {
            this.subwoofer.setHabilitado(false);
        }
    }

    public void ajustarVolumen(boolean subir, int tipoParlante) {
        if (tipoParlante == 1 && subir == true) {
            this.derecho.setSubirVolumen(true);
        } else if (tipoParlante == 1 && subir == false) {
            this.derecho.setSubirVolumen(false);
        } else if (tipoParlante == 2 && subir == true) {
            this.izquierdo.setSubirVolumen(true);
        } else if (tipoParlante == 2 && subir == false) {
            this.izquierdo.setSubirVolumen(false);
        } else if (tipoParlante == 3 && subir == true) {
            this.subwoofer.setSubirVolumen(true);
        } else {
            this.subwoofer.setSubirVolumen(false);
        }
    }

    public void elegirReproduccion(int elegirReproductor) {
        if (elegirReproductor == 1) {
            this.listaAudios = listaAudios;
        } else {
            this.rad.setAudioRadio("10101");
        }
    }

    public String[] getListaAudios() {
        return listaAudios;
    }

    public void setListaAudios(String[] listaAudios) {
        this.listaAudios = listaAudios;
    }

    public int getCantidadAudios() {
        return cantidadAudios;
    }

    public void setCantidadAudios(int cantidadAudios) {
        this.cantidadAudios = cantidadAudios;
    }

    public ParlantePequeno getDerecho() {
        return derecho;
    }

    public void setDerecho(ParlantePequeno derecho) {
        this.derecho = derecho;
    }

    public ParlantePequeno getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(ParlantePequeno izquierdo) {
        this.izquierdo = izquierdo;
    }

    public ParlanteSubwoofer getSubwoofer() {
        return subwoofer;
    }

    public void setSubwoofer(ParlanteSubwoofer subwoofer) {
        this.subwoofer = subwoofer;
    }

    public Radio getRad() {
        return rad;
    }

    public void setRad(Radio rad) {
        this.rad = rad;
    }

    public int getElegirReproductor() {
        return elegirReproductor;
    }

    public void setElegirReproductor(int elegirReproductor) {
        this.elegirReproductor = elegirReproductor;
    }

}
