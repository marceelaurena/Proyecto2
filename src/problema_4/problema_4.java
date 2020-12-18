
package problema_4;

import java.util.Scanner;


public class problema_4 {
    
    
public static void main(String args[]){
   Scanner sistema = new Scanner (System.in);
    int [] arreglo = new int[5];

    arreglo [0] = 3;
    arreglo [1] = 5;
    arreglo [2] = 93;
    arreglo [3] = 32;
    arreglo [4] = 44;
       
for (int i=0 ; i < arreglo.length; i+=2){
System.out.println(arreglo[i]);
}

System.out.println("Digite un numero: ");
int numero = sistema.nextInt();

for (int j=0; j<5; j++){
if ( numero == arreglo [j]){
System.out.println("Su numero se encontro en el arreglo.");
}
else {
System.out.println("Su numero no fue encontrado en el arreglo.");
}
}

}
}
