
public class Binbaum
{
    public Baumelement wurzel;
    
    public Binbaum() {
        wurzel = new Abschluss();
    }
    
    public void Einfügen(Woerterbucheintrag datenNeu) {
        wurzel.Einfügen(datenNeu);
    }
}
