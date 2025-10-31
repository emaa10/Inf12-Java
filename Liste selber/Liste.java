public class Liste
{
    private Knoten anfang;

    public Liste()
    {
     anfang = null;
    }
    
    int laengeGeben() {
        if(anfang == null) {
            return -1;
        }
        else{
            return anfang.restlaengeGeben();
        }
    }
    
    void hintenEinfuegen(Datenelement dneu) {
        if(anfang != null) {
            anfang.hintenEinfuegen(dneu);
        }
        else {
            Knoten kneu = new Knoten(dneu);
            anfang = kneu;
        }
    }
    
    void vorneEinfuegen(Datenelement dneu) {
        if(anfang != null) {
            Knoten kneu = new Knoten(dneu);
            Knoten anfangAlt = anfang;
            anfang = kneu;
            anfang.nachfolgerSetzen(anfangAlt);
        }
        else{
            Knoten kneu = new Knoten(dneu);
            anfang = kneu;
        }
    }
    
    void vorneEntfernen() {
        anfang = anfang.nachfolgerGeben();
    }
    
    Datenelement DatenelementSuchen(Datenelement d) {
        if(anfang != null) {
            return anfang.datenelementSuchen(d);           
        }
        return null;
    }
    
    void zwischenEinfuegen(Datenelement dneu, int pos) {
        if(anfang != null) {
            anfang.zwischenEinfuegen(dneu, pos);
        }
        else{
            System.out.println("leere Liste");
        }
    }
}    


