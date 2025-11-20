
/**
 * Beschreibung der Liste
 * 
 * @author Klaus Reinold
 * @version 1.0
 */
class Liste
{
    /** erstes Element der Liste */
    private Listenelement anfang;

    /**
     * Konstruktor der Liste
     */
    Liste()
    {
        anfang = new Abschluss(); 
    }
    
    /**
     * Einfügen am Anfang der Liste (nichtrekursiv!)
     * @param dNeu neues Datenelement
     */
    void VorneEinfügen(Datenelement dNeu)
    {
        anfang = new Knoten(dNeu,anfang);
    }
    
    int längeBestimmen() {
        return anfang.RestlängeGeben(1);
    }

    Datenelement endeEntfernen() {
        Datenelement d = anfang.EndeGeben(null);
        anfang = anfang.knotenEntfernen(d);
        return d;
    }
    
    Datenelement anfangEntfernen() {
        Datenelement d = this.anfang.datenGeben();
        anfang = anfang.nachfolgerGeben();
        return d;
    }
    
    void knotenEntfernen(Datenelement d) {
        anfang = anfang.knotenEntfernen(d);
    }
    
    void informationenAusgeben() {
        System.out.println("Informationen Beginn");
        anfang.informationenAusgeben();
    }
}
