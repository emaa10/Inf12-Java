/**
 * Lagerist in einem Lager
 * 
 * @author Johannes Neumeyer
 * @version 1.0
 */
import java.util.Date;
public class Lagerist extends Thread
{
    /** graphische Darstellung des Lageristen */
    LageristenSymbol symbol;

    /**
     * Konstruktor für Objekte der Klasse Lagerist
     */
    public Lagerist(String helmfarbe, int nummer)
    {
        symbol = new LageristenSymbol(helmfarbe, nummer);
    }

    /**
     * Schiebt eine Kiste bis zum rechten Rand des Zeichenfensters.
     */
    public void run()
    {
        while (symbol.XPositionGeben() < 763)
        {
            symbol.Gehen(1);
            symbol.Warten(5);
            long start = new Date().getTime();
            while(new Date().getTime() - start < 100){}
        }
        
    }
}
