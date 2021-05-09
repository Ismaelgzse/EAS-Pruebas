import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.*;

public class pruebaEventos {
    public static void main(String[] args){
        MarcoBotones m = new MarcoBotones();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoBotones extends JFrame  {
    public MarcoBotones(){
        setTitle("prueba de imagenes ");
        setBounds(750,300,500,300);
        LaminaBotones l = new LaminaBotones();
        add(l);
    }
}

class LaminaBotones extends JPanel implements ActionListener{
    JButton b = new JButton("Azul");
    public LaminaBotones(){
        add(b);
        b.addActionListener(this); // boton desencadena un evento que ercibe LaminaBotones, la propia clase en la q nos encontramos
    }

    public void actionPerformed(ActionEvent e){
        // recibe un evento pero no sabe quien lo ha desencadenodo
        //para saber quien :
        Object botonPulsado = e.getSource();
        if (botonPulsado==b){
            setBackground(Color.blue );
        }
        setBackground(Color.blue);
    }
}
