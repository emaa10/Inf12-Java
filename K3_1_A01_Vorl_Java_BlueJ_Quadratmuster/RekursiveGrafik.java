
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
    void Quadratezeichnen(int anzahl) {
        if(anzahl == 1) {
            QuadratZeichnen(anzahl*10);
        } else{
            Quadratezeichnen(anzahl-1);
            QuadratZeichnen(anzahl*10);
        }
    }
    
    void PerlenketteZeichnen(int anzahl) {
        if(anzahl == 1) {
            QuadratZeichnen(20);
        } else {
            PerlenketteZeichnen(anzahl-1);
            QuadratZeichnen(20);
            turtle.Gehen(40);
        }
    }
    
    void QuadratMusterZeichnen(int gesamtAnzahl, int restAnzahl) {
        if(restAnzahl == 0) {
            // turtle.StiftHeben();
            // turtle.Gehen(40);
            // turtle.StiftSenken();
            // QuadratZeichnen(40);
        } else {
            turtle.StiftHeben();
            turtle.Gehen(40);
            turtle.StiftSenken();
            QuadratZeichnen(40);
            turtle.StiftHeben();
            turtle.Gehen(-40);
            turtle.Drehen(360/gesamtAnzahl);
            QuadratMusterZeichnen(gesamtAnzahl, restAnzahl-1);
        }
    }
    
    void checkPalindrome(String wort) {
        if(wort.length() <= 1) {
            System.out.println("Ist ein Palindrom");
        } else {
            int length = wort.length();
            if(wort.charAt(0) == (wort.charAt(length-1))) {
                checkPalindrome(wort.substring(1, length-1));
            } else {
                System.out.println("Ist kein Palindrom: " + wort);
            }
        }
    }
}
