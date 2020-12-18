
package problema_6;


public class NumeroClase {
    int clase;
    String universidad;
    
public NumeroClase(){
}
public NumeroClase(int clase, String universidad){
this.clase = clase;
this.universidad = universidad;
}
public void datosClase(){
System.out.println("El numero de clase del alumno es: " + clase + " y estudia en la universidad " + universidad);
}
public int getClase(){
return clase;
}
public void setClase (int clase){
this.clase = clase;
}

public String getUniversidad(){
return universidad;
}
public void setUniversidad (String universidad){
this.universidad = universidad;
}
}
