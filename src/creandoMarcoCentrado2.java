import javax.swing.*;
import java.awt.*;

public class creandoMarcoCentrado2 {
    public static void main(String[] args){
    MarcoCentrado m  = new MarcoCentrado();
    m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    m.setVisible(true);

    }
}

class MarcoCentrado extends JFrame {

    public MarcoCentrado() {
        Toolkit miPantalla = Toolkit.getDefaultToolkit(); // almacenamos sistema activo de ventanas
        Dimension tamanoPantalla= miPantalla.getScreenSize(); // guardamos dimensión de la pantalla
        int altura = tamanoPantalla.height;
        int anchura = tamanoPantalla.width;

        setSize(anchura/2,altura/2);
        setLocation(anchura/4,altura/4);
        setTitle("marco centrado");

        Image miIcono = miPantalla.getImage("java.png");
        setIconImage(miIcono );
    }
}
