
public class Abschluss extends Baumelement
{
    Abschluss() {
        super();
    }
    
    Baumelement Einfügen(Woerterbucheintrag datenNeu) {
        return new Knoten(datenNeu);
    }
}
