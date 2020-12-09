
package problema_1;

import java.util.Scanner;


public class problema_1 {


public static void main(String[] args) {
    
Scanner monedas = new Scanner(System.in);


while (true){
TiposDeMoneda moneda = new TiposDeMoneda();

System.out.println("Digite cantidad de unidades");
int unidades = monedas.nextInt();

System.out.println("En que tipo de moneda esta su dinero? 1==colon, 2==dolar, 3==euro");
int tipo = monedas.nextInt();

System.out.println("A que tipo de moneda desea combertirlo? 1== colon, 2 == dolar, 3 == euro");
int conversion = monedas.nextInt();

if(tipo==1 && conversion==2){
int resultado = 500*unidades;
System.out.println("El resultado es: " + resultado);
}
else if (tipo==1 && conversion==3){
double resultado = unidades*500/1.53;
System.out.println("El resultado es: " + resultado);
}
else if (tipo==2 && conversion==1){
int resultado = unidades*500;
System.out.println("El resultado es: " + resultado);
}
else if (tipo==2 && conversion==3){
double resultado = unidades*1.53;
System.out.println("El resultado es: " + resultado);
}
else if (tipo==3 && conversion==1){
double resultado = 500*1.53/unidades;
System.out.println("El resultado es: " + resultado);
}
else {
double resultado = unidades*1.53;
System.out.println("El resultado es: " + resultado);
}
}
}    
}
    

