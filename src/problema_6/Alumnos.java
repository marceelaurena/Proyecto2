
package problema_6;


public class Alumnos {

    PadreFamiliar padre;
    PadreFamiliar madre;
    String nombre;
    String apellido;
    double cedula;
    
    public Alumnos (){
    }
    
    public Alumnos (PadreFamiliar padre, String nombre, String apellido, int cedula){
    this.padre = padre;
    this.nombre = nombre;
    this.apellido = apellido;
    this.cedula = cedula;
    }
    
    public Alumnos (PadreFamiliar madre, String nombre, String apellido){
    this.madre = madre;
    this.nombre = nombre;
    this.apellido = apellido;
    this.cedula = cedula;
    }
    
    public Alumnos (String nombre, String apellido, int cedula){
    this.nombre = nombre;
    this.apellido = apellido;
    this.cedula = cedula;
    }
    public void datosAlumnos(){
    System.out.println("Los datos del alumno son los siguientes: nombre = " + nombre + " apellidos= " + apellido + " cédula= " + cedula);
    }
    
     public void imprimirPadreFamiliar(){
        System.out.println(padre.getNombre() + " " + padre.getApellido());
        System.out.println(padre); 
        System.out.println(madre.getNombre() + " " + madre.getApellido());
        System.out.println(madre); 
    } 
     
    
    public String getNombre(){
    return nombre;
}
    
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    
    public String getApellido(){
    return apellido;
}
    
    public void setApellido(String apellido){
    this.apellido = apellido;
    }
    
    public double getCedula(){
    return cedula;
}
    
    public void setCedula(double cedula){
    this.cedula = cedula;
    }
    
     public PadreFamiliar getPadre() {
        return padre;
    }

    public void setPadre(PadreFamiliar padre) {
        this.padre = padre;
    }
     public PadreFamiliar getMadre() {
        return madre;
    }

    public void setMadre(PadreFamiliar madre) {
        this.madre = madre;
    }
    
   
    }

