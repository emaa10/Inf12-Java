
/**
 * Beschreibung der Klasse Hund
 * 
 * @author Klaus Reinold 
 * @version 0.9
 */
class Hund implements Datenelement
{
    /** Name des Hundes */
    private String name;

    Hund(String s)
    {
        name = s;
    }

    /**
     * Gibt Information über den Hund aus.
     */
    public void InformationAusgeben()
    {
        System.out.println(name);
    }

    /**
     * Gibt den Namen des Hundes aus
     * @return Name des Hundes
     */
    public String NameGeben()
    {
        return name;
    }
}
