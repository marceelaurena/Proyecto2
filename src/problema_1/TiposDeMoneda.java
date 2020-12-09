
package problema_1;

public class TiposDeMoneda {
    int colon = 500;
    int dolar = 1;
    double euro = 1.53*dolar; 
    int unidades;
    int resultado;
    
public TiposDeMoneda () {
}
public TiposDeMoneda (int colon, int dolar, double euro, int unidades, int resultado){
this.colon = colon;
this.dolar = dolar;
this.euro = euro;
this.unidades = unidades;
this.resultado = resultado;
}

public void calcularUnidadMonetaria(){
System.out.println("La cantidad de dinero es de: " + resultado);
}
public int getColon(){
return colon;
}
public void setColon(int colon){
this.colon = 500;
}
public int getDolar(){
return colon;
}
public void setDolar(int dolar){
this.dolar = 1;
}
public double getEuro(){
return euro;
}
public void setEuro(double euro){
this.euro = 1.53;
}
public int getUnidades(){
return unidades;
}
public void setUnidades(int unidades){
this.unidades = unidades;
}
public int getResultado(){
return resultado;
}
public void setResultado(int resultado){
this.resultado = resultado;
}

}

