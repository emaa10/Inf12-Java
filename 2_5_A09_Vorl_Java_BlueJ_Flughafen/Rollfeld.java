import java.util.ArrayList;
/**
 * Rollfeld an einem Flughafen
 * 
 * @author Johannes Neumeyer
 * @version 1.0
 */
public class Rollfeld
{
    private Rechteck rollfeld;
    private Rechteck startpiste;
    private ArrayList<Flugzeug> flugzeuge;

    /**
     * Konstruktor für Objekte der Klasse Rollfeld
     */
    public Rollfeld()
    {
        flugzeuge = new ArrayList<Flugzeug>();
        RollfeldErstellen();
            
        // Aufrufe zum Testen
        InWarteschlangeEinreihen(new Flugzeug("rot"));
        InWarteschlangeEinreihen(new Flugzeug("gelb"));
        InWarteschlangeEinreihen(new Flugzeug("grün"));
        InWarteschlangeEinreihen(new Flugzeug("magenta"));
        // InWarteschlangeEinreihen(new Flugzeug("cyan"));
        // InWarteschlangeEinreihen(new Flugzeug("grau"));
    }

    /**
     * Erstellt das Rollfeld.
     */
    private void RollfeldErstellen()
    {                
        rollfeld = new Rechteck();
        rollfeld.GrößeSetzen(1000, 500);
        rollfeld.PositionSetzen(0, 413);
        rollfeld.FarbeSetzen("grau");

        startpiste = new Rechteck();
        startpiste.GrößeSetzen(400, 5);
        startpiste.PositionSetzen(600, 413);
        startpiste.FarbeSetzen("orange");
    }
    
    public void InWarteschlangeEinreihen(Flugzeug flugzeug) {
        flugzeuge.add(flugzeug);
        flugzeug.PositionSetzen(660-flugzeuge.size() * 100, 400);
    }
    
    public void StarterlaubnisErteilen() {
        flugzeuge.get(0).Starten();
        flugzeuge.remove(0);
    }
    
    public void AlleVorrücken() {
        for(Flugzeug f: flugzeuge) {
            f.Vorrücken();
        }
    }
    
    public void StartVorziehen(int neuerIndex, Flugzeug flugzeug) {
        flugzeuge.add(neuerIndex, flugzeug);
        for(int i = 0; i<neuerIndex; i++) {
            flugzeuge.get(i).Vorrücken();
        }
        
        flugzeug.PositionSetzen(660- neuerIndex * 100, 400); 
    }
}
