
package proyectotickets;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LimpiarPantalla {
    
    //Esta funcion simula presionar las teclas Ctrl+L para limpiar la consola de NetBeans
    public void limpiarPantalla() {
        try{
            Robot bot = new Robot();
            bot.keyPress(17);
            bot.keyPress(76);
            bot.keyRelease(17);
            bot.keyRelease(76);
            
            //Le agrego un delay para que no borre parte del disenio de las pantallas
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(LimpiarPantalla.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }catch(AWTException ex){
            System.out.println(""+ex.getMessage());
        }
    } 
}
