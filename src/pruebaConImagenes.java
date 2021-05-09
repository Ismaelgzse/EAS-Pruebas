import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class pruebaConImagenes {
    public static void main(String[] args){
        MarcoConImagenes m = new MarcoConImagenes();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoConImagenes extends JFrame {
    public MarcoConImagenes(){
        setTitle("prueba de imagenes ");
        setBounds(750,300,300,200);
        LaminaConImagen l = new LaminaConImagen();
        add(l);
    }
}

class LaminaConImagen extends JPanel {
    //para cargarla en memoria habría que ponerlo al inicializar el panel la lectura de la imágen
    public LaminaConImagen(){
        try{
            imagen = ImageIO.read(new File("menina.jpeg"));
        }catch(IOException e){
            System.err.println("no encontramos la imagen");
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //File  miImagen = new File("menina.jpeg");
        try{
            imagen = ImageIO.read(new File("menina.jpeg"));
        }catch(IOException e){
            System.err.println("no encontramos la imagen");
        }
        int anchuraImagen = imagen.getWidth(this);
        int alturaImagen = imagen.getHeight(this);


        g.drawImage(imagen, 5,5,null); //imag, coordX, coordY, objeto que hay que informar del proceso que lo admitía:null

    }

    private Image imagen; //almacenamos aquí la imágen que importaremos de la carpeta
}