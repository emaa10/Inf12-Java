
class Test
{
    Bestellsystem b;
    Test() {
        b = new Bestellsystem(10);
        b.SpeisekarteAusgeben();
        for(int i = 0; i<10; i++){
            System.out.println("\nTisch " + i);
            b.Bestellen(i, "Semmelknödel", 2);
            b.Bestellen(i, "Maracujaschorle", 3);
            b.RechnungAusgeben(i);
        }
    }
}
