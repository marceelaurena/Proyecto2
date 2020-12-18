
package problema_6;

/**
 *
 * @author mymac
 */
public class PadreFamiliar {
   
    String nombre;
    String apellido;  
    
   
public PadreFamiliar(){

}
public PadreFamiliar (String nombre, String Apellido){
    this.nombre = nombre;
    this.apellido = apellido;
}
public void datosPariente(){
    System.out.println("El nombre del padre es " + nombre + apellido);
   
}
public String getNombre(){
return nombre;
}
public void setNombre(String nombre){
this.nombre= nombre;
}
public String getApellido(){
return apellido;
}
public void setApellido(String Apellido){
this.apellido = apellido;
}}
