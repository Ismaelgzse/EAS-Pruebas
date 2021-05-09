import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class pruebaDibujo4 {
    public static void main(String[] args){
        MarcoConDibujos m = new MarcoConDibujos();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoConDibujos extends JFrame {
    public MarcoConDibujos(){
        setTitle("prueba de dibujo ");
        setSize(400,400);
        LaminaConFiguras l = new LaminaConFiguras();
        add(l);
    }
}

class LaminaConFiguras extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(50,50,200,200);
        g.drawLine(100,100,300,200);
        g.drawArc(50,100,100,200,120,150);

        Graphics2D  g2 = (Graphics2D) g;
        Rectangle2D r =  new Rectangle2D.Double(100,100,200.25,150);
        g2.draw(r);

        Ellipse2D e = new Ellipse2D.Double();
        e.setFrame(r);
        g2.draw(e);

        g2.draw(new Line2D.Double(100,100,300,250));

        double centroEnX = r.getCenterX();
        double centroEnY = r.getCenterY();
        double radio = 150;
        Ellipse2D c =  new Ellipse2D.Double();
        c.setFrameFromCenter(centroEnX,centroEnY,centroEnX+radio,centroEnY+radio);
        g2.draw(c);

    }
}