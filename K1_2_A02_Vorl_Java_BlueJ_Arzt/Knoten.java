
class Knoten
{
    /** Verwaltung des nachfolgenden Patienten in der Warteschlange. */
    private Knoten nachfolger;
    public Patient patient;

    /**
     * Konstruktor des Patienten
     * @param s Name des Patienten
     */
    Knoten(Patient patientNeu)
    {
        patient = patientNeu;
    }

    /**
     * Nachfolger des Patienten setzen
     * @param nf neuer Nachfolger
     */
    void NachfolgerSetzen(Knoten nf)
    {
        nachfolger = nf;
    }

    /**
     * Gibt den Nachfolger des Patienten aus.
     * @return Nachfolger
     */
    Knoten NachfolgerGeben()
    {
        return nachfolger;
    }

    /**
     * Gibt Information über den Patienten aus.
     */
    void InformationAusgeben()
    {
        System.out.println(patient.NameGeben());
    }
}
