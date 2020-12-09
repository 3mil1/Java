import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Burger, Lisandid> menüü = new HashMap<Burger, Lisandid>();

            // Polümorfism

        Burger burger1 = new Burger("Chicken burger", "valge sai","Kana lihaga",  1.80);
        Burger burger2 = new Burger("Old Fashioned Cheeseburger", "valge sai","loomalihaga",  2.00);
        Burger burger3 = new Burger("New York Burger", "sealiha", 2.00);
        Lisandid lisandid1 = new Lisandid(new Lisand("Juust", .20), new Lisand("Salat", 0.10), new Lisand("Tomat", 0.15), new Lisand("Majonees", 0.20));
        Lisandid lisandid2 = new Lisandid(new Lisand("Peekon", .20), new Lisand("Kurk", 0.10), new Lisand("Sibul", 0.15), new Lisand("Peekoni kaste", 0.20));
        Lisandid lisandid3 = new Lisandid(new Lisand("Ananass", .20), new Lisand("Tomat", 0.10), new Lisand("Kurk", 0.15), new Lisand("Sibul", 0.20));
        menüü.put(burger1, lisandid1);
        menüü.put(burger2, lisandid2);
        menüü.put(burger3, lisandid3);

            // Abstraktsioon

        Kassa restoraan = new Kassa(menüü);
        restoraan.PrindiMenüü();
        restoraan.KüsiMillistBurgeritKlietnSoovib();
        restoraan.küsiMisLisandeidKlientSoovib();
        restoraan.saadaTšekk();
    }
}
