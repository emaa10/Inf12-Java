/**
 * Beschreibung der Klasse Knoten
 * 
 * @author Klaus Reinold 
 * @version 1.0
 */
class Knoten extends Listenelement
{
    /** Verwaltung der Daten */
    private Datenelement daten;

    /** Verwaltung des nachfolgenden Knotens in der Liste */
    private Listenelement nachfolger;

    /**
     * Konstruktor des Knotens
     * @param dNeu Datenelement
     * @param lNeu neuer Nachfolger
     */
    Knoten(Datenelement dNeu, Listenelement lNeu)
    {
        daten = dNeu;
        nachfolger  = lNeu;
    }
    
    @Override int RestlängeGeben(int x) {
        return nachfolger.RestlängeGeben(x) +1;
    }
}
