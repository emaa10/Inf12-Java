
/**
 * Stellt einen Pfeil für den Vorratsstapel dar.
 * 
 * @author Albert Wiedemann
 * @version 1.0
 */
class PfeilSymbol
{
    /** Pfeillinie */
    private Rechteck linie;
    /** Pfeilspitze */
    private Dreieck spitze;
    /** Beschriftung */
    private Text beschriftung;

    /**
     * Legt das Pfeilsymbol an.
     * @param höhe Anzeigehöhe (Pfeilspitze)
     * @param tiefe die anzuzeigende Rekursionstiefe
     */
    PfeilSymbol (int höhe, int tiefe)
    {
        linie = new Rechteck();
        linie.PositionSetzen(210, höhe);
        linie.GrößeSetzen(30, 1);
        linie.FarbeSetzen("schwarz");
        spitze = new Dreieck();
        spitze.GrößeSetzen(10, 10);
        spitze.PositionSetzen(210, höhe - 5);
        spitze.FarbeSetzen("schwarz");
        spitze.Drehen(90);
        beschriftung = new Text();
        beschriftung.PositionSetzen(245, höhe + 4);
        beschriftung.TextSetzen("" + tiefe);
    }
    
    /**
     * Entfernt das Pfeilsymbol aus der Anzeige
     */
    void Entfernen()
    {
        linie.Entfernen();
        spitze.Entfernen();
        beschriftung.Entfernen();
    }
    
    /**
     * Setzt das Symbol auf eine neue Höhe
     * @param höhe die neue Höhe
     */
    void HöheSetzen(int höhe)
    {
        linie.PositionSetzen(210, höhe);
        spitze.PositionSetzen(210, höhe - 5);
        beschriftung.PositionSetzen(245, höhe + 4);
    }
}
