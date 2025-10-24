
/**
 * Beschreibung der Warteschlange
 * 
 * @author Klaus Reinold
 * @version 1.0
 */
class Liste
{
    /** erster Knoten der Warteschlange */
    private Knoten anfang;

    /**
     * Konstruktor der Warteschlange
     */
    Liste()
    {
        anfang = null; 
    }

    /**
     * Fügt ein neues Datenelement am Ende der Warteschlange ein.
     * @param dNeu neues Datenelement
     */
    void HintenEinfügen(Datenelement dneu)
    {
        if (anfang != null)
        {
            anfang.HintenEinfügen(dneu);
        }
        else
        {
            anfang = new Knoten(dneu);
        }
    }
    
    void VorneEinfügen(Datenelement dNeu) {
        Knoten kneu = new Knoten(dNeu);
        Knoten anfang_davor = anfang;
        anfang = kneu;
        anfang.NachfolgerSetzen(anfang_davor);
    }
    
    void einfügenVor(Datenelement dNeu, Datenelement vergleichswert) {
        if(dNeu.DatenelementGeben() != vergleichswert) {
            
        }
    }
    
    int LaengeGeben(){
        if(anfang ==null) {
            return 0;
        }
        else{
            return anfang.RestelaengeGeben();
        }
    }
    
    int DatenelementSuchen(String name) {
        if(anfang == null) {
            return -1;
        }
        else{
            return anfang.DatenelementSuchen(name,1);
        }
    }
    
    /**
     * Entfernt den ersten Patient aus der Warteschlange und gibt ihn zurück.
     * @return bisheriger erster Patient 
     */
    Datenelement Entfernen()
    {
        return null;
        // Diese Lösung muss überarbeitet werden, weil die Referenz auf das Ende
        // nicht mehr vorhanden ist. 
        // Knoten k = anfang;
        // if (anfang != null)
        // {
            // if (anfang == ende)
            // {
                // anfang = null;
                // ende = null;
            // }
            // else
            // {
                // anfang=anfang.NachfolgerGeben();
            // }
            // return k.DatenelementGeben();
        // }
        // else
        // {
            // return null;
        // }
    }


    /**
     * Gibt Information über die Warteschlange aus.
     */
    void InformationAusgeben()
    {
        if (anfang != null)
        {
            anfang.InformationAusgeben();
        }
    }
}
