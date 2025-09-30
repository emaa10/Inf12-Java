public class Warteschlange
{
    private Bild anfang;
    private Bild ende;
    public Warteschlange()
    {
        this.anfang = null;
        this.ende = null;
    }

    public void einfügen(Bild b) {
        if(ende == null) {    //wenn es schon Objekte gibt 
            anfang = b;
        } else {                //gibt noch keine Objekte
            ende.nachfolgerSetzen(b);
        }
        ende = b;
    }
    
    public Bild entfernen() {
        Bild b = anfang;
        if(anfang == null) {//wenn es keine Objekte gibt
            return null;
        } else{             // wenn es Objekte gibt
            anfang = b.nachfolgerGeben();
            if(anfang == null) {
                ende = null;
            }
            return b;
        }
    }
    
    public void informationenAusgeben() {
        System.out.println("Anfang: " + anfang.NameGeben());
        System.out.println("Ende: " + ende.NameGeben());
    }
}
