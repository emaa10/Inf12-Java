import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bildanzeige extends JFrame implements ActionListener 
{

    private JLabel label;
    private JButton button;
    private ImageIcon image;

    private Warteschlange w=new Warteschlange();

    Bildanzeige() 
    {
        setTitle("Bildanzeige");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        w.einfügen(new Bild("bild1.jpg"));
        w.einfügen(new Bild("bild2.jpg"));
        w.einfügen(new Bild("bild3.jpg"));
        w.einfügen(new Bild("bild4.jpg"));
        w.einfügen(new Bild("bild5.jpg"));

        // Erstelle das Label mit dem ersten Bild
        Bild b = w.entfernen();
        String name = b.NameGeben();
        image = new ImageIcon(name);
        label = new JLabel(image);
        add(label, BorderLayout.CENTER);

        // Erstelle den Button und füge ihn zum Frame hinzu
        button = new JButton("Bild wechseln");
        button.addActionListener(this);
        add(button, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Methode, die aufgerufen wird, wenn der Button gedrückt wird
    public void actionPerformed(ActionEvent event) 
    {
        if (event.getSource() == button) 
        {
            Bild b = w.entfernen();
            String name = b.NameGeben();
            image = new ImageIcon(name);
            label.setIcon(image);

        }
    }

    public static void main(String[] args) 
    {
        new Bildanzeige();
    }
}