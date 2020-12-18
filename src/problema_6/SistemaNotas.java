
package problema_6;

/**
 *
 * @author mymac
 */
public class SistemaNotas {
    int maxRegistros=100;
    Notas[] examenes = new Notas[maxRegistros];
    int cont=0;
    
    public SistemaNotas(){
    }
   
    //elimina el ult examen del arreglo
    public boolean eliminarEx(){
        boolean resultado=false;
        if(cont!=0){
            examenes[cont-1]=null;
            cont--;
            resultado=true;
        }
        return resultado;
    }
    
    //agregar un examen al arreglo
    public boolean agregarEx(Notas ex){
        boolean resultado=false;
        if(cont<maxRegistros){ //el arreglo tiene espacio
            examenes[cont]=ex;
            cont++;
            resultado=true;
        }
        return resultado;
    }
    
    //mostrar examenes
    public void mostrarNotas(){
        for(int i=0;i<cont;i++){
            if(examenes[i]!=null)
                System.out.println(examenes[i].toString());
        }
    }
    
    //calcular promedio
    public float promedioNotas(){
        float retorno=0f;
        
        return retorno;
    }
    
}

