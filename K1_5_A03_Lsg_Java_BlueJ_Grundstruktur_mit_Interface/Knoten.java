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
    public Listenelement nachfolger;

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
        return nachfolger.RestlängeGeben(x) + 1;
    }
    
    Datenelement EndeGeben(Datenelement d) {
        return nachfolger.EndeGeben(this.daten);
    }
    
    Datenelement datenGeben() {
        return this.daten;
    }
    
    Listenelement nachfolgerGeben() {
        return this.nachfolger;
    }
    
    Listenelement knotenEntfernen(Datenelement d) {
        if(this.daten == d) {
            return nachfolger;
        } else {
            nachfolger = nachfolger.knotenEntfernen(d);
            return this;
        }
    }
    
    void informationenAusgeben() {
        daten.InformationAusgeben();
        nachfolger.informationenAusgeben();
    }
}
