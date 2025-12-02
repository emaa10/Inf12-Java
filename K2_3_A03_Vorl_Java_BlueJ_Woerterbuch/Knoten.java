
public class Knoten
{
    public Baumelement nachfolgerLinks;
    public Baumelement nachfolgerRechts;
    public Datenelement daten;
    public Knoten(Datenelement dNeu) {
        daten = dNeu;
        nachfolgerLinks = new Abschluss();
        nachfolgerRechts = new Abschluss();
    }
}
