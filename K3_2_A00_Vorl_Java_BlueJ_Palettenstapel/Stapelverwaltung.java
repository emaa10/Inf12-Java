
import java.util.*;
/**
 * Verwaltet die Anzeige der Palettenstapel
 * 
 * @author Albert Wiedemann 
 * @version 1.0
 */
class Stapelverwaltung extends Ereignisbehandlung
{
    /** Die möglichen Palettenfarben */
    private final String [] farben = new String [] {"rot", "grün", "blau", "gelb", "cyan", "magenta", "orange", "braun", "weiß"};
    /** Anzeige des Vorratsstapels */
    private ArrayList<PalettenSymbol> vorratsStapel;
    /** Anzeige des aktuellen Stapels */
    private ArrayList<PalettenSymbol> aktuellerStapel;
    /** Anzeige des optimalen Stapels */
    private ArrayList<PalettenSymbol> optimalerStapel;
    /** Feld der Markierungspfeile */
    private ArrayList<PfeilSymbol> pfeile;
    /** Tick des Taktgeber da */
    private boolean tickDa;
    /** Bezeichner des Palettenvorrats */
    private Text bezeichnerVorrat;
    /** Bezeichner des aktuellen Stapels */
    private Text bezeichnerAktuell;
    /** Bezeichner des optimalen Stapels */
    private Text bezeichnerOptimal;
    /** Höhenbegrenzung für einen Palettenstapel */
    private Rechteck oberkante;
    /** Bezeichner der Oberkante */
    private Text bezeichnerOberkante;

    /**
     * Legt den Vorratsstapel an
     * @param vorrat der Palettenvorrat
     * @param maximaleHöhe die maximale Höhe, die ein Palettenstapel haben darf
     */
    Stapelverwaltung (ArrayList<Palette> vorrat, int maximaleHöhe)
    {
        super();
        vorratsStapel = new ArrayList<PalettenSymbol>();
        aktuellerStapel = new ArrayList<PalettenSymbol>();
        optimalerStapel = new ArrayList<PalettenSymbol>();
        pfeile = new ArrayList<PfeilSymbol>();
        int farbenIndex = 0;
        int aktHöhe = 450;
        for (Palette p: vorrat)
        {
            int h = p.HöheGeben();
            aktHöhe -= h;
            vorratsStapel.add(new PalettenSymbol(100, aktHöhe, h, p.GewichtGeben(), farben[farbenIndex % farben.length]));
            farbenIndex += 1;
        }
        tickDa = false;
        bezeichnerVorrat = new Text();
        bezeichnerVorrat.TextSetzen("Palettenvorrat");
        bezeichnerVorrat.PositionSetzen(110, 470);
        bezeichnerAktuell = new Text();
        bezeichnerAktuell.TextSetzen("Aktueller Versuch");
        bezeichnerAktuell.PositionSetzen(400, 470);
        bezeichnerOptimal = new Text();
        bezeichnerOptimal.TextSetzen("Bisher bester Stapel");
        bezeichnerOptimal.PositionSetzen(600, 470);
        oberkante = new Rechteck();
        oberkante.GrößeSetzen(400, 3);
        oberkante.PositionSetzen(400, 450 - maximaleHöhe - 3);
        oberkante.FarbeSetzen("schwarz");
        bezeichnerOberkante = new Text();
        bezeichnerOberkante.TextSetzen("Maximale Stapelhöhe");
        bezeichnerOberkante.PositionSetzen(400, 450 - maximaleHöhe - 20);
    }
    
    /**
     * Wartet auf den nächsten Tick des Taktgebers
     */
    void AufTaktimpulsWarten()
    {
        while (!tickDa)
        {
            try
            {
                Thread.sleep(10);
            }
            catch (Exception e)
            {
                //nichts
            }
        }
        tickDa = false;
    }
    
    /**
     * Die Aktionsmethode des Zeitgebers.
     */
    @Override void TaktImpulsAusführen()
    {
        tickDa = true;
    }
    
    /**
     * Setzt den optimalen Stapel
     * pre: der aktuelle Stapel ist optimal.
     */
    void OptimalenStapelSetzen()
    {
        for (PalettenSymbol s: optimalerStapel)
        {
            s.Entfernen();
        }
        optimalerStapel.clear();
        for (PalettenSymbol s: aktuellerStapel)
        {
            PalettenSymbol neu = s.KopieErstellen();
            neu.XPositionSetzen(600);
            optimalerStapel.add(neu);
        }
        AufTaktimpulsWarten();
    }
    
    /**
     * Fügt den Eintrag für die Palette mit dem gegebenen Index zum aktuellen Stapel hinzu
     * @param index der Index der Palette;
     */
    void AktuellHinzufügen(int index)
    {
        PalettenSymbol neu = vorratsStapel.get(index).KopieErstellen();
        int h = 0;
        for (PalettenSymbol s: aktuellerStapel)
        {
            h += s.HöheGeben();
        }
        neu.PositionSetzen(400, 450 - (h + neu.HöheGeben()));
        aktuellerStapel.add(neu);
        AufTaktimpulsWarten();
    }
    
    /**
     * Entfernt das oberste Element vom aktuellen Stapel.
     */
    void AktuellEntfernen()
    {
        PalettenSymbol alt = aktuellerStapel.remove(aktuellerStapel.size() - 1);
        alt.Entfernen();
        AufTaktimpulsWarten();
    }
    
    /**
     * Setzt einen Markierungspfeil auf den Vorratsstapel
     * @param index der Index in den Vorratsstapel
     * @param tiefe die anzuzeigende Rekursionstiefe
     */
    void PfeilSetzen(int index, int tiefe)
    {
        int h = 0;
        for (int i = 0; i < index; i += 1)
        {
            h += vorratsStapel.get(i).HöheGeben();
        }
        h += vorratsStapel.get(index).HöheGeben() / 2;
        if (tiefe == pfeile.size() + 1)
        {
            
            pfeile.add(new PfeilSymbol(450 - h, tiefe));
        }
        else
        {
            pfeile.get(tiefe-1).HöheSetzen(450 - h);
        }
        AufTaktimpulsWarten();
    }
    
    /**
     * Löscht den obersten Pfeil.
     */
    void PfeilLöschen()
    {
        PfeilSymbol alt = pfeile.remove(pfeile.size() - 1);
        alt.Entfernen();
    }
}
