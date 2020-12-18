
package problema_6;

public class Notas {
    int dia;
    int nota;
    int puntosObtenidos;
    int puntosTotales;
    
public Notas(){
}
public Notas (int dia){
    this.dia = dia;
    
switch (dia){
case 1 : 
    if (dia==1){
    System.out.println("El estudiante realizo la prueba el dia lunes 30 de noviembre.");
    }
break;
case 2 :
    if (dia==2){
    System.out.println("El estudiante realizo la prueba el dia lunes 7 de diciembre.");
    }
    break;
}

}
public Notas (int nota, int puntosObtenidos, int puntosTotales){
this.nota = nota;
this.puntosObtenidos = puntosObtenidos;
this.puntosTotales = puntosTotales;
}
public void datosNotas(){
System.out.println("Las nota es: " + nota + " los puntos totales fueron " + puntosTotales + " y los obtenidos " + puntosObtenidos);
}

public int getNota() {
    return nota;
}
public void setNota (int nota){
this.nota = nota;
}

public int getPuntosObtenidos() {
    return puntosObtenidos;
}
public void setPuntosObtenidos (int puntosObtenidos){
this.puntosObtenidos = puntosObtenidos;
}

public int getPuntosTotales() {
    return puntosTotales;
}
public void setPuntosTotales (int puntosTotales){
this.puntosTotales = puntosTotales;
}}
