
/**
 * Beschreibung der Warteschlange
 * 
 * @author Klaus Reinold
 * @version 0.9
 */
class Warteschlange
{
    /** erster Patient der Warteschlange */
    private Knoten anfang;

    /** letzter Patient der Warteschlange */
    private Knoten ende;

    /**
     * Konstruktor der Warteschlange
     */
    Warteschlange()
    {
        anfang = null; 
        ende = null;
    }

    /**
     * Fügt einen neuen Patienten am Ende der Warteschlange ein.
     * @param patientNeu neuer Patient
     * 
     */
    void Einfügen(Knoten knotenNeu)
    {
        if (anfang == null)
        {
            anfang = knotenNeu;
        }
        else
        {
            ende.NachfolgerSetzen(knotenNeu);
        }
        ende = knotenNeu;
    }

    /**
     * Entfernt den ersten Patient aus der Warteschlange und gibt ihn zurück.
     * @return bisheriger erster Patient 
     */
    Knoten Entfernen()
    {
        Knoten k=anfang;
        if (anfang != null)
        {
            if (anfang == ende)
            {
                anfang = null;
                ende = null;
            }
            else
            {
                anfang=anfang.NachfolgerGeben();
            }
        }
        return k;
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
