import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class pruebaConColores6 {
    public static void main(String[] args){
        MarcoConColor m = new MarcoConColor();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
    }
}

class MarcoConColor extends JFrame {
    public MarcoConColor(){
        setTitle("prueba con colores");
        setSize(400,400);
        LaminaConColor l = new LaminaConColor();
        add(l);
        //l.setBackground(Color.PINK);
        l.setBackground(SystemColor.window);

    }
}

class LaminaConColor extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Rectangle2D r = new Rectangle2D.Double(100,100,200,150);
        g2.setPaint(Color.BLACK);
        g2.draw(r); // para pintar los bordes hay que hacer draw y luego fill
        g2.setPaint(Color.RED.darker());
        g2.fill(r);


        Ellipse2D e = new Ellipse2D.Double();
        e.setFrame(r);
        g2.setPaint(new Color(0,140,255).brighter());
        g2.fill(e);
        g2.draw(e);
    }

}
