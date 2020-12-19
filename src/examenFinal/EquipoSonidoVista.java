
package examenFinal;

import java.util.Scanner;


public class EquipoSonidoVista {
 
    Scanner entrada = new Scanner(System.in);
    ParlanteDerecho pd;
    ParlanteIzquierdo pi;
    ParlanteSubwoofer ps;
    ListaAudios lista;
    
// AJUSTE PARLANTES
public void AjustarVolumen(){

System.out.println("Seleccione el volumen para el parlante derecho del 0 al 10");
int volumen1 = entrada.nextInt();
System.out.println("Seleccione el volumen para el parlante izquierdo del 0 al 10");
int volumen2 = entrada.nextInt();
System.out.println("Seleccione el volumen para el parlante subwoofer del 0 al 10");
int volumen3 = entrada.nextInt();
}
public void HabilitarParlante (ParlanteDerecho pd, ParlanteIzquierdo pi, ParlanteSubwoofer ps){
boolean habilitar = true;
System.out.println("Si desea deshabilitar el parlante derecho marque 1");
int habilitarPd = entrada.nextInt();
System.out.println("Si desea deshabilitar el parlante izquierdo marque 1");
int habilitarPi = entrada.nextInt();
System.out.println("Si desea deshabilitar el parlante subwoofer marque 1");
int habilitarPs = entrada.nextInt();

if (habilitarPd == 1){
habilitar = false;
}
else {
habilitar = true;
}
if (habilitarPi == 1){
habilitar = false;
}
else {
habilitar = true;
}
if (habilitarPs == 1){
habilitar = false;
}
else {
habilitar = true;
}}
// AJUSTE LISTA DE REPRODUCCION
public void menuListaReproduccion(){
int menu=0;
switch(menu){
    case 1:
        
}
}
}

