public class Hund implements Datenelement
{
    private String name;
    public Hund(String neuname) {
        name = neuname;
    }
    public void informationenAusgeben() {
        System.out.println(name);
    }
}
