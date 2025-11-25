public class Stapel
{
    private Liste liste;
    
    public Stapel() {
        liste = new Liste();
    }
    
    void push(Datenelement dNeu)
    {
        liste.VorneEinfügen(dNeu);
    }
    
    Datenelement pop() {
        return liste.AnfangEntfernen();
    }
    
    void akteAusgeben() {
        liste.InformationAusgeben();
    }
}
