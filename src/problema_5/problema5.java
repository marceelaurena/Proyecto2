/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_5;

import java.util.Scanner;

public class problema5 {
    public static void main(String args[]){ 
        Scanner muestra = new Scanner(System.in);
        
        int arreglo1[];
        int arreglo2[];
        int arreglo3[];
        
        arreglo1 = new int[7];
        arreglo2 = new int [7];
        arreglo3 = new int[14];
        
System.out.println("Digite el primer arreglo: ");
for (int i = 0; i<7; i++){
System.out.println("Digite un numero: ");
arreglo1[i] = muestra.nextInt();
}

System.out.println("Digite el segundo arreglo: ");
for (int i = 0; i<7; i++){
System.out.println("Digite un numero: ");
arreglo2[i] = muestra.nextInt();
}

int j = 0;
for (int i=0; i<7; i++){
arreglo3[j] = arreglo1[i];
j++;
arreglo3[j] = arreglo2[i];
j++;
}

System.out.print("Los arreglos combinados quedarian asi: ");
for (int i=0; i<14; i++){
System.out.print(arreglo3[i] + " ");
}
}
}
