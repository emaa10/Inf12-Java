
public class Knoten extends Baumelement
{
    public Baumelement nachfolgerLinks;
    public Baumelement nachfolgerRechts;
    public Woerterbucheintrag daten;
    
    public Knoten(Woerterbucheintrag dNeu) {
        super();
        daten = dNeu;
        nachfolgerLinks = new Abschluss();
        nachfolgerRechts = new Abschluss();
    }
    
    Baumelement Einfügen(Woerterbucheintrag datenNeu) {
        if(daten == datenNeu) {
            System.out.println("Daten sind schon enthalten!");
        }
        else {
            if(daten.IstGrößerAls(datenNeu)) {
                nachfolgerLinks = nachfolgerLinks.Einfügen(datenNeu);
            
            }
            else {
                nachfolgerRechts = nachfolgerRechts.Einfügen(datenNeu);
            }
        }
        return this;
    }
}
