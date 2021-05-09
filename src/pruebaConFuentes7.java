import javax.swing.*;
import java.awt.*;

public class pruebaConFuentes7 {
    public static void main(String[] args){
        MarcoConFuentes m = new MarcoConFuentes();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConFuentes extends JFrame{
    public MarcoConFuentes(){
        setTitle("prueba de fuentes ");
        setSize(400,400);
        LaminaConFuentes l = new LaminaConFuentes();
        add(l);
    }
}

class LaminaConFuentes extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Font f = new Font("Calibri",Font.BOLD,26);
        g2.setFont(f);
        g2.setColor(Color.pink);
        g2.drawString("Debbie", 100,100);
    }

}
