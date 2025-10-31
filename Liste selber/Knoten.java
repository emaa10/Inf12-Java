public class Knoten
{
    private Knoten nachfolger;
    private Datenelement daten;
    
    public Knoten(Datenelement dneu)
    {
        daten = dneu;
        nachfolger = null;
    }
    
    public void nachfolgerSetzen(Knoten neuNachfolger) {
        nachfolger = neuNachfolger;
    }
    
    public Knoten nachfolgerGeben() {
        return nachfolger;
    }
    
    public Datenelement datenelementGeben() {
        return daten;
    }
    
    void hintenEinfuegen(Datenelement dneu) {
        if(nachfolger != null){
            nachfolger.hintenEinfuegen(dneu);
        }
        else{
            Knoten kneu = new Knoten(dneu);
            nachfolger = kneu;
        }
    }
    
    int restlaengeGeben() {
        if(nachfolger == null) {
            return 1;
        }
        else{
            return nachfolger.restlaengeGeben() + 1;
        }
    }
    
    Datenelement datenelementSuchen(Datenelement dl) {
        if(daten == dl) {
            return dl;
        }
        else {
            return nachfolger.datenelementSuchen(dl);
        }
    }
    
    public void zwischenEinfuegen(Datenelement dneu, int pos) {
        pos--;
        if(pos == 0) {
            Knoten nachfolgerAlt = nachfolger;
            Knoten kneu = new Knoten(dneu);
            nachfolger = kneu;
            kneu.nachfolgerSetzen(nachfolgerAlt);
        }
        else{
            nachfolger.zwischenEinfuegen(dneu,pos);
        }
    }
}
