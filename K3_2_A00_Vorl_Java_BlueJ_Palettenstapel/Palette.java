
/**
 * Beschreibt die Daten einer Palette
 * 
 * @author Albert Wiedemann
 * @version 1.0
 */
class Palette
{
    /** Höhe der Palette */
    private int höhe;
    /** Gewicht der Palette */
    private int gewicht;
    
    /**
     * Der Konstruktor legt die Daten fest
     * @param h Höhe der Palette
     * @param g Gewicht der Palette
     */
    Palette(int h, int g)
    {
        höhe = h;
        gewicht = g;
    }
    
    /**
     * Gibt die Höhe der Palette zurück
     * @return Höhe
     */
    int HöheGeben()
    {
        return höhe;
    }
    
    /**
     * Gibt das Gewicht der Palette zurück
     * @return Gewicht
     */
    int GewichtGeben()
    {
        return gewicht;
    }
}
