
package problema_2;

import java.util.Scanner;


public class problema_2 {


public static void main(String[] args) {
    
Scanner monedas = new Scanner(System.in);
Scanner nombres = new Scanner (System.in);

while (true){
Monedero moneda = new Monedero();

System.out.println("Digite cantidad de unidades");
int unidades = monedas.nextInt();

System.out.println("En que tipo de moneda esta su dinero? 1==colon, 2==dolar, 3==euro");
String moneda1 = nombres.nextLine();

System.out.println("A que tipo de moneda desea combertirlo? 1== colon, 2 == dolar, 3 == euro");
String conversion = nombres.nextLine();

System.out.println("Digite el tipo de cambio de su dinero con respecto al que desea convertir");
double tipoCambio = monedas.nextInt();

if("colon".equals(moneda1) && "dolar".equals(conversion)){
double resultado = tipoCambio/unidades;
System.out.println("El resultado es: " + resultado);
}
else if ("colon".equals(moneda1) && "euro".equals(conversion)){
double resultado = unidades/tipoCambio;
System.out.println("El resultado es: " + resultado);
}
else if ("dolar".equals(moneda1) && "colon".equals(conversion)){
double resultado = unidades*tipoCambio;
System.out.println("El resultado es: " + resultado);
}
else if ("dolar".equals(moneda1) && "euro".equals(conversion)){
double resultado = unidades*tipoCambio;
System.out.println("El resultado es: " + resultado);
}
else if ("euro".equals(moneda1) && "colon".equals(conversion)){
double resultado = unidades*tipoCambio;
System.out.println("El resultado es: " + resultado);
}
else {
double resultado = unidades*tipoCambio;
System.out.println("El resultado es: " + resultado);
}
}
}    
}
    

