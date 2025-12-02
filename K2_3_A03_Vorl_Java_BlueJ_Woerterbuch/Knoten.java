
public class Knoten extends Baumelement
{
    public Baumelement nachfolgerLinks;
    public Baumelement nachfolgerRechts;
    public Datenelement daten;
    
    public Knoten(Datenelement dNeu) {
        super();
        daten = dNeu;
        nachfolgerLinks = new Abschluss();
        nachfolgerRechts = new Abschluss();
    }
}
