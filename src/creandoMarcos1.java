import javax.swing.*;
import java.awt.*;


public class creandoMarcos1 {
    public static void main(String[] args){

        miMarco m1 = new miMarco();
        m1.setVisible(true);
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class miMarco extends JFrame{
    public miMarco() throws HeadlessException {
        // setSize(500,300);
        // setLocation(500,300);
        // setBounds(500,300,250,250);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("mi ventana");
    }

}
