import javax.swing.*;
import java.awt.*;

public class escribiendoEnMarco3 {
    public static void main(String[] args){
        MarcoConTexto m = new MarcoConTexto();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

class MarcoConTexto extends JFrame{
    public MarcoConTexto(){
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("primer texto");
        Lienzo l = new Lienzo();
        add(l); //ahora le decimos al marco, oye pon la lámina por encima
    }
}

class Lienzo extends JPanel{
    public void  paintComponent(Graphics g){

        super.paintComponent(g); //PRIMERO:invocamos a paintComponent desde la clase JComponent para que haga su trabajo

        g.drawString("aprendiendo string", 100,100);  //SEGUNDO: esto hace que JComponent "paintComponent" haga su trabajo
        // + esto que le decimos

    }
}