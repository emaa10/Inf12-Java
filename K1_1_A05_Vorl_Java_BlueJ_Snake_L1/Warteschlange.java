public class Warteschlange
{
    private RumpfSymbol anfang;
    private RumpfSymbol ende;
    public Warteschlange()
    {
        this.anfang = null;
        this.ende = null;
    }

    public void einfügen(RumpfSymbol r) {
        if(ende == null) {    //wenn es schon Objekte gibt 
            anfang = r;
        } else {                //gibt noch keine Objekte
            ende.nachfolgerSetzen(r);
        }
        ende = r;
    }
    
    public RumpfSymbol entfernen() {
        RumpfSymbol r = anfang;
        if(anfang == null) {//wenn es keine Objekte gibt
            return null;
        } else{             // wenn es Objekte gibt
            anfang = r.nachfolgerGeben();
            if(anfang == null) {
                ende = null;
            }
            return r;
        }
    }
    
    public void informationenAusgeben() {
        System.out.println("Anfang: " + anfang.InfosGeben());
        System.out.println("Ende: " + ende.InfosGeben());
    }
}
