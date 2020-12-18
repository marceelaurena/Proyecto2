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
        int arreglo2[] = {37,18,2,90,12,32,8};
        int arreglo3[];
        
        arreglo1 = new int[7];
        arreglo2 = new int [7];
        arreglo3 = new int[14];
       
        arreglo1[0] = 2;
        arreglo1[1] = 3;
        arreglo1[2] = 8;
        arreglo1[3] = 9;
        arreglo1[4] = 7;
        arreglo1[5] = 0;
        arreglo1[6] = 1;
        
        arreglo2[0] = 21;
        arreglo2[1] = 33;
        arreglo2[2] = 7;
        arreglo2[3] = 90;
        arreglo2[4] = 78;
        arreglo2[5] = 10;
        arreglo2[6] = 100;
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
