
/**
 * Klasse zur Beschreibung eines Bildes
 * 
 * @author Klaus Reinold 
 * @version 0.9
 */
 class Bild
{
    /** Dateiname */
    private String name;
    private Bild nachfolger;
    
    //Die Nachfolgerverwaltung fehlt noch.
     
    /**
    * Konstruktor des Bildes
    * @param s Name des Bildes
    */
    Bild(String s)
    {
        name = "Bilder/" + s;
        nachfolger = null;
    }
    
     /**
     * Gibt Information über das Bild aus.
     */
    public void InformationAusgeben()
    {
        System.out.println(name);
    }
    
    /**
     * Gibt den Namen des Bildes aus
     * @return Name des Bildes
     */
    public String NameGeben()
    {
        return name;
    }
    
    public void nachfolgerSetzen(Bild b) {
        nachfolger = b;
    }
    
    public Bild nachfolgerGeben() {
        return nachfolger;
    }
}
