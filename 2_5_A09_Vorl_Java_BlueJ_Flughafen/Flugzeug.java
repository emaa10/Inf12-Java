/**
 * Flugzeug auf einem Rollfeld
 * 
 * @author Johannes Neumeyer
 * @version 1.0
 */
public class Flugzeug extends Figur
{    
    /**
     * Konstruktor für Objekte der Klasse Flugzeug
     * @param farbe Farbe des Flugzeugs
     */
    public Flugzeug(String farbe)
    {
        super();
        DarstellungFestlegen(farbe);
    }

    /**
     * Lässt ein Flugzeug auf dem Rollfeld einen Platz weiter vorrücken.
     */
    public void Vorrücken()
    {
        Gehen(100);
    }

    /**
     * Simuliert das Starten eines Flugzeugs.
     */
    public void Starten()
    {
        Gehen(1000);
    }

    /**
     * Legt die Darstellung eines Flugzeugs fest.
     * @param farbe Farbe des Flugzeugs
     */
    private void DarstellungFestlegen(String farbe)
    {
        FigurteilFestlegenRechteck(-45, -25, 70, 25, farbe);
        FigurteilFestlegenRechteck(-50, -50, 5, 50, farbe);
        FigurteilFestlegenDreieck(-25, 0, -45, 0, -45, -50, farbe);
        FigurteilFestlegenEllipse(0, -25, 50, 25, farbe);
        FigurteilFestlegenDreieck(10, -15, -30, -15, -50, 10, "schwarz");
        // Fenster vorne
        FigurteilFestlegenDreieck(30, -25, 30, -10, 50, -10, "schwarz");
        // Räder vorne
        FigurteilFestlegenRechteck(25, 0, 1, 5, "schwarz");
        FigurteilFestlegenEllipse(22, 8, 7, 7, "schwarz");
        // Räder hinten
        FigurteilFestlegenRechteck(-20, 0, 1, 5, "schwarz");
        FigurteilFestlegenEllipse(-24, 6, 9, 9, "schwarz");

        GrößeSetzen(80);
    }
    
    
}
