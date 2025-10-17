
/**
 * Beschreibung der Warteschlange
 * 
 * @author Klaus Reinold
 * @version 0.9
 */
class Warteschlange
{
    private Knoten anfang;

    private Knoten ende;

    Warteschlange()
    {
        anfang = null; 
        ende = null;
    }

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

    void InformationAusgeben()
    {
        if (anfang != null)
        {
            anfang.InformationAusgeben();
        }
    }
}
