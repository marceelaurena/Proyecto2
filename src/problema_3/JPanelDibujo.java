
package problema_3;
import javax.swing.*;
import java.awt.*;


public class JPanelDibujo extends JPanel{

  public JPanelDibujo(){
    this.setBackground(Color.BLACK);
  }
 
  // Reimplementa paint
  
  @Override
  public void paint (Graphics g) { 
        super.paint(g);
     
    
    boolean ovalos = true;
    while (ovalos){
    Ovalo ov = new Ovalo (Math.random()); 
        g.setColor(Color.BLUE);     
        g.fillOval(ov.getPosX(), ov.getPosY(),ov.getAncho(), ov.getAlto());
    }
      
    boolean rectangulos = true;
    while (rectangulos){
      Rectangulo rect = new Rectangulo(Math.random());

        g.setColor(Color.yellow);
        g.fillRect(rect.getAncho(),rect.getAlto(),rect.getAncho(),rect.getAlto());

     }}


}


