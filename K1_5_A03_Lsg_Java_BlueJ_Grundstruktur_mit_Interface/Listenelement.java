/**
 * Abstrakte Klasse Listenelement als Oberklasse für Knoten und Abschluss
 * 
 * @author Klaus Reinold
 * @version 1.0
 */
public abstract class Listenelement
{
    abstract int RestlängeGeben(int x);
    abstract Datenelement EndeGeben(Datenelement d);
    abstract Listenelement knotenEntfernen(Datenelement d);
    abstract Datenelement datenGeben();
    abstract Listenelement nachfolgerGeben();
    abstract void informationenAusgeben();
    abstract Listenelement hintenEinfügen(Datenelement d);
}

    
    
    


