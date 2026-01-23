
/**
 * Erzeugt das Sierpinski-Dreieck.
 * 
 * @author Albert Wiedemann
 * @version 1.0
 */
class SierpinskiDreieck
{

    /**
     * Legt das Grunddreieck an und stößt die Rekursion an
     * @@param tiefe Rekursionstiefe
     */
    SierpinskiDreieck (int tiefe)
    {
        Dreieck basis = new Dreieck();
        basis.FarbeSetzen("weiß");
        basis.PositionSetzen(400, 10);
        basis.GrößeSetzen(600, 520);
        SchrittAusführen(400, 10, 600, 520, tiefe);
    }
    
    static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } 
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    /**
     * Ermittelt den Rekursionsschritt
     * @x x-Position der Dreiecksspitze
     * @y y-Position der Dreiecksspitze
     * @breite die Breite des Umgebungsdreiecks
     * @höhe die Höhe des Umgebungsdreiecks
     * @tiefe restliche Rekursionstiefe
     */
    void SchrittAusführen(int x, int y, int breite, int höhe, int tiefe)
    {
        // Start:         SchrittAusführen(400, 10, 600, 520, tiefe);
        if (tiefe > 0)
        {
            SchrittAusführen(x, y, breite / 2, höhe / 2, tiefe - 1); // oben
            //wait(500);
            SchrittAusführen(x + (breite/4), y + (höhe/2), breite / 2, höhe / 2, tiefe - 1); // rechts
            //wait(500);
            SchrittAusführen(x - (breite/4), y + (höhe/2), breite / 2, höhe / 2, tiefe - 1); // links
        }
        else
        {
            Dreieck basis = new Dreieck();
            basis.FarbeSetzen("schwarz");
            basis.PositionSetzen(x, y);
            basis.GrößeSetzen(breite, höhe);
        }
    }
    
    boolean istGerade(int n) {
        return gerade(n);
    }
    
    boolean gerade(int n) {
        if (n == 0) {
            return true;
        } else {
            return ungerade(n-1);
        }
    }
    
    boolean ungerade(int n) {
        if (n == 0) {
            return false;
        } else {
            return gerade(n-1);
        }
    }
}
