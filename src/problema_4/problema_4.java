
package problema_4;

import java.util.Scanner;


public class problema_4 {
    
Scanner sistema = new Scanner (System.in);

public static void main(String args[]){
    int [] arreglo = new int[5];

    arreglo [0] = 3;
    arreglo [1] = 5;
    arreglo [2] = 93;
    arreglo [3] = 32;
    arreglo [4] = 44;
    
       
for (int i=0 ; i < arreglo.length; i+=2){
System.out.println(arreglo[i]);
}

}
}
