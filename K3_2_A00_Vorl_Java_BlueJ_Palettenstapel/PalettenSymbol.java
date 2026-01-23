
/**
 * Stellt eine Palette auf der Zeichenfläche dar.
 * 
 * @author Albert Wiedemann 
 * @version 1.0
 */
class PalettenSymbol
{
    /** x-Koordinate */
    private int x;
    /** y-Koordinate */
    private int y;
    /** Höhe */
    private int höhe;
    /** Farbe */
    private String farbe;
    /** Gewicht für die Beschriftung */
    private int gewicht;
    /** Rahmen */
    private Rechteck rahmen;
    /** Fläche */
    private Rechteck fläche;
    /** Text */
    private Text text;

    /**
     * Legt die Elemente des Symbols an
     * @param x x-Koordinate
     * @param y y-Koordinate
     * @param höhe Höhe der Palette
     * @param gewicht Gewicht für die Beschriftung
     * @param farbe Farbe
     */
    PalettenSymbol (int x, int y, int höhe, int gewicht, String farbe)
    {
        this.gewicht = gewicht;
        this.x = x;
        this.y = y;
        this.höhe = höhe;
        this.farbe = farbe;
        rahmen = new Rechteck();
        rahmen.PositionSetzen(x, y);
        rahmen.GrößeSetzen(100, höhe);
        rahmen.FarbeSetzen("schwarz");
        fläche = new Rechteck();
        fläche.PositionSetzen(x + 2, y + 2);
        fläche.GrößeSetzen(96, höhe - 4);
        fläche.FarbeSetzen(farbe);
        text = new Text();
        text.PositionSetzen(x + 40, y + höhe - 4);
        text.TextSetzen("" + gewicht);
    }
    
    /**
     * Erzeugt ein neues Symbol mit gleichen Daten
     * @return Kopie
     */
    PalettenSymbol KopieErstellen()
    {
        return new PalettenSymbol(x, y, höhe, gewicht, farbe);
    }
        
    /**
     * Setzt die Position (der linken oberen Ecke) des Symbols.
     * @param x x-Position der linken oberen Ecke
     * @param y y-Position der linken oberen Ecke
     */
    void PositionSetzen(int x, int y)
    {
        this.x = x;
        this.y = y;
        rahmen.PositionSetzen(x, y);
        fläche.PositionSetzen(x + 2, y + 2);
        text.PositionSetzen(x + 40, y + höhe - 4);
    }

    /**
     * Setzt die Position (der linken oberen Ecke) des Symbols.
     * @param x x-Position der linken oberen Ecke
     */
    void XPositionSetzen(int x)
    {
        this.x = x;
        rahmen.PositionSetzen(x, y);
        fläche.PositionSetzen(x + 2, y + 2);
        text.PositionSetzen(x + 40, y + höhe - 4);
    }
    
    /**
     * Gibt die Höhe des Symbols zurück.
     * @return Höhe
     */
    int HöheGeben()
    {
        return höhe;
    }
    
    /**
     * Entfernt das Symbol aus der Anzeige
     */
    void Entfernen()
    {
        rahmen.Entfernen();
        fläche.Entfernen();
        text.Entfernen();
    }
}
