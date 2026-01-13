
/**
 * Rahmenklasse zum Zeichen von Mustern aus Quadraten
 * 
 * @author Albert Wiedemann
 * @version 1.0
 */
class RekursiveGrafik
{
    /** Die Turtle zum Zeichnen */
    Turtle turtle;

    /**
     * Der Konstruktor legt die Turtle an.
     */
    RekursiveGrafik ()
    {
        turtle = new Turtle();
    }
    
    /**
     * Zeichnet ein Quadrat mit gegebener Seitenlänge an der Stelle der Turtle
     * @param länge Seitenlänge des Quadrats
     */
    private void QuadratZeichnen(double länge)
    {
        for (int i = 0; i < 4; i += 1)
        {
            turtle.Gehen(länge);
            turtle.Drehen(-90);
        }
    }
    
    /**
     * Zeichnet ein Element der Perlenkette
     * @param anzahl (Rest-)anzahl der Quadrate
     */
    void PerlenketteZeichnen (int anzahl)
    {
        //Hier Rumpf implementieren
    }
}
