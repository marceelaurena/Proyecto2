
package problema_6;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SistemaNotasInterfaz {
   boolean modoGrafico;
   boolean modoInteractivo;
   Notas examen;
   Alumnos alumno;
   PadreFamiliar padre;

public SistemaNotasInterfaz (Notas examen, Alumnos alumno, PadreFamiliar padre, boolean modoGrafico, boolean modoInteractivo){
this.examen = examen;
this.alumno = alumno;
this.padre = padre;
this.modoGrafico = modoGrafico;
this.modoInteractivo = modoInteractivo;
}
public void notasExamen (){
double ex;
double puntosObtenidos;
if (modoGrafico) {
            ex = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota Examen"));
            puntosObtenidos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese puntos Obtenidos"));
        } else {
            System.out.println("Digite nota Examen");
            Scanner s = new Scanner(System.in);
            ex = s.nextDouble();
            puntosObtenidos = s.nextDouble();
        }
}
public void alumnos(){
String nombreCompleto;
double cedula;
if (modoGrafico) {
            nombreCompleto = (JOptionPane.showInputDialog("Ingrese nombre del Alumno"));
            cedula = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cedula del alumno"));
        } else {
            System.out.println("Digite nombre y cedula del alumno");
            Scanner s = new Scanner(System.in);
            nombreCompleto = s.nextLine();
            cedula = s.nextDouble();
        }
}
public void padres(){
String nombreMadre;
String nombrePadre;
if (modoGrafico) {
            nombreMadre = (JOptionPane.showInputDialog("Ingrese nombre de la madre"));
            nombrePadre = (JOptionPane.showInputDialog("Ingrese nombre del padre"));
        } else {
            System.out.println("Digite nombre de la madre y el padre");
            Scanner s = new Scanner(System.in);
            nombreMadre = s.nextLine();
            nombrePadre = s.nextLine();
        }
}

}
