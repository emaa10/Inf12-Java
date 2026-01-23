
import java.util.*;
/**
 * Rekursive Lösung eines Rucksackproblems
 * 
 * @author Albert Wiedemann 
 * @version 1.0
 */
class StapelAufgabe
{
    /** Feld der vorhandenen Paletten */
    private ArrayList<Palette> paletten;
    /** Feld mit den Palettenindizes der (bisher) optimalen Lösung */
    private ArrayList<Palette> optimaleLösung;
    /** (bisher) optimales Gewicht */
    private int optimalesGewicht;
    /** maximale Höhe */
    private final int maximaleHöhe;
    /** Verwaltung der Stapelanzeigen */
    Stapelverwaltung verwaltung;
    
    /**
     * Der Konstruktor erstellt die Paletten und besetzt die Attribute vor
     */
    StapelAufgabe ()
    {
        paletten = new ArrayList<Palette>();
        paletten.add(new Palette(80, 9));
        paletten.add(new Palette(90, 8));
        paletten.add(new Palette(50, 5));
        paletten.add(new Palette(55, 6));
        paletten.add(new Palette(15, 3));
        paletten.add(new Palette(30, 2));
        paletten.add(new Palette(25, 4));
        optimalesGewicht = 0;
        optimaleLösung = null;
        maximaleHöhe = 150;
        verwaltung = new Stapelverwaltung(paletten, maximaleHöhe);
    }
    
    /**
     * Sucht die Palettenkonfiguration mit der maximalen Höhe 
     */
    void MaximumsucheStarten()
    {
        Schritt(0, 0, 0, new ArrayList<Palette>(), 1);
        System.out.println("Das maximal erreichbare Gewicht ist: " + optimalesGewicht);
    }
    
    /**
     * Führt den nächsten Schritt der Suche aus
     * @param aktIndex der Index, ab dem die Paletten ausprobiert werden sollen
     * @param aktHöhe die aktuelle Höhe des Stapels
     * @param aktGewicht das aktuelle Gewicht des Stapels
     * @param lösungsansatz Feld mit den bisher auf dem Stapel befindlichen Paletten
     * @param tiefe die Rekursionstiefe
     */
    private void Schritt(int aktIndex, int aktHöhe, int aktGewicht, ArrayList<Palette> lösungsansatz, int tiefe)
    {
        if (aktGewicht > optimalesGewicht)
        {
            optimalesGewicht = aktGewicht;
            // Die folgende Zeile erzeugt eine Kopie des mit lösungsansatz referenzierten Feldes.
            // Die Methode clone erzeugt die Kopie
            // Der Operator (ArrayList<Palette>) gibt an, dass die Kopie tatsächlich von der Klasse ArrayList<Palette> ist.
            optimaleLösung = (ArrayList<Palette>) lösungsansatz.clone();
            // Alle Botschaften an das Objekt verwaltung dienen nur der grafischen Darstellung und
            // sind nicht Teil des Backtrackings
            verwaltung.OptimalenStapelSetzen();
        }
        if (aktIndex < paletten.size())
        {
            for (int i = aktIndex; i < paletten.size(); i += 1)
            {
                Palette p = paletten.get(i);
                verwaltung.PfeilSetzen(i, tiefe);
                if (p.HöheGeben() + aktHöhe <= maximaleHöhe)
                {
                    lösungsansatz.add(p);
                    verwaltung.AktuellHinzufügen(i);
                    Schritt(i + 1, p.HöheGeben() + aktHöhe, p.GewichtGeben() + aktGewicht, lösungsansatz, tiefe + 1);
                    lösungsansatz.remove(p);
                    verwaltung.AktuellEntfernen();
                }
            }
            verwaltung.PfeilLöschen();
        }
    }
}
