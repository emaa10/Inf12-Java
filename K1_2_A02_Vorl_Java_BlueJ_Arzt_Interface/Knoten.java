
class Knoten
{
    private Knoten nachfolger;
    public Datenelement d;

    Knoten(Datenelement dNeu)
    {
        nachfolger = null;
        d = dNeu;
    }

    void NachfolgerSetzen(Knoten nf)
    {
        nachfolger = nf;
    }

    Knoten NachfolgerGeben()
    {
        return nachfolger;
    }
    
    void InformationAusgeben()
    {
        d.InformationAusgeben();    
    }
}
