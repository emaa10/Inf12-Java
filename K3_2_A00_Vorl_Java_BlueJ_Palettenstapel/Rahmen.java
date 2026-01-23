
/**
 * Rahmenklasse des Programms
 * 
 * @author Albert Wiedemann 
 * @version 1.0
 */
class Rahmen
{

    /**
     * Der Konstruktor legt das eigentliche Arbeitsobjekt an und startet die Lösung.
     */
    Rahmen ()
    {
        new StapelAufgabe().MaximumsucheStarten();
    }
    
    /**
     * Standard-Startmethode
     */
    public static void main (String[] args)
    {
        new Rahmen();
    }
}
