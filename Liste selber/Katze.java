
public class Katze implements Datenelement
{
    private String name;
    public Katze(String neuname) {
        name = neuname;
    }
    public void informationenAusgeben() {
        System.out.println(name);
    }
}

