
package problema_2;

public class Monedero {
    int colon;
    String moneda1;
    String conversion;
    double tipoCambio;
    int unidades;
    int resultado;
    
public Monedero () {
}
public Monedero (int colon, String moneda1, String conversion, double tipoCambio, int unidades, int resultado){
this.colon = colon;
this.moneda1 = moneda1;
this.conversion = conversion;
this.tipoCambio = tipoCambio;
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
public String getMoneda1(){
return moneda1;
}
public void setMoneda1(String moneda1){
this.moneda1 = moneda1;
}
public String getConversion(){
return conversion;
}
public void setConversion(String conversion){
this.conversion = conversion;
}
public double getTipoCambio(){
return tipoCambio;
}
public void setTipoCambio(double tipoCambio){
this.tipoCambio = tipoCambio;
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

