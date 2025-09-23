
/**
 * Klasse zur Beschreibung eines Speisekarteneintrags
 * 
 * @author Klaus Reinold 
 * @version 1.0
 */
class Speisekarteneintrag
{
    /** Name des Artikels */
    private String name;
    /** Preis des Artikels */
    private double preis;
    
    /**
     * Konstruktor für Objekte der Klasse Speisekarteneintrag
     */
    Speisekarteneintrag(String nameNeu, double preisNeu)
    {
        name = nameNeu;
        preis = preisNeu;
    }

    /**
     * Gibt den Namen zurück
     * @return Name des Eintrags
     */
    public String NameGeben()
    {
        return name;        
    }

    /**
     * Gibt den Preis zurück
     * @return Preis des Eintrags
     */
    double PreisGeben()
    {
        return preis;
    }

}
