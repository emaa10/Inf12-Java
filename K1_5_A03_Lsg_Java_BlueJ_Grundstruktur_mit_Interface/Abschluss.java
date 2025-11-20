/**
 * Klasse zur Kennzeichnung des Ende der Liste
 * 
 * @author Klaus Reinold
 * @version 1.0
 */
public class Abschluss extends Listenelement
{
    @Override int RestlängeGeben(int x) {
        return 0;
    }
    
    Datenelement EndeGeben(Datenelement d) {
        return d;
    }
    
    Listenelement knotenEntfernen(Datenelement d) {
        return this;
    }
    
    Datenelement datenGeben() {
        return null;
    }

    Listenelement nachfolgerGeben() {
        return null;
    }
    
    void informationenAusgeben() {
        System.out.println("---");
    }
}

    
    
    


