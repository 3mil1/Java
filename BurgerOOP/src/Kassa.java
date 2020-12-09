import java.util.Map;
import java.util.Scanner;

public class Kassa {
    Map<Burger,Lisandid> menüü;
    Burger valitudBurger = null;
    public Double burgeriHind = null;
    Lisandid valitudBurgeriLisandid = null;
    
    public Kassa(Map<Burger,Lisandid> menüü) {
        this.menüü = menüü;
    }
    public void PrindiMenüü(){
        for (Map.Entry<Burger, Lisandid> entry : menüü.entrySet()) {
            System.out.println(entry.getKey().nimi + " | " + entry.getKey().hind + " | " + entry.getKey().liha + " | " +entry.getKey().sai);
        }
        System.out.println("-----------------------------------------------------");
    }

    // KOMPOSITSIOON


    public void KüsiMillistBurgeritKlietnSoovib(){

        while(true){
            System.out.print("Vali oma burger: ");
            Scanner sc= new Scanner(System.in);
            String valitudBurgeriNimi= sc.nextLine();
            for (Map.Entry<Burger, Lisandid> entry : menüü.entrySet()) {
                if(entry.getKey().nimi.matches(valitudBurgeriNimi)){
                    this.valitudBurger = entry.getKey();
                    this.burgeriHind = entry.getKey().hind;
                    this.valitudBurgeriLisandid = entry.getValue();
                }
            }
            if(this.valitudBurger != null && this.valitudBurgeriLisandid != null){
                this.valitudBurger.printBurger();
                break;
            }else{
                System.out.println("Kuskil on kirjaviga");
            }
        }
        System.out.println("-----------------------------------------------------");
    }
    public void küsiMisLisandeidKlientSoovib(){
        System.out.print("Vali oma lisandid: ");
        if(valitudBurgeriLisandid.klientValibLisandid(this.valitudBurgeriLisandid.lisa1)){
            this.burgeriHind = this.burgeriHind + this.valitudBurgeriLisandid.lisa1.hind;
        };
        if(valitudBurgeriLisandid.klientValibLisandid(this.valitudBurgeriLisandid.lisa2)){
            this.burgeriHind = this.burgeriHind + this.valitudBurgeriLisandid.lisa2.hind;
        }
        if(valitudBurgeriLisandid.klientValibLisandid(valitudBurgeriLisandid.lisa3)){
            this.burgeriHind = this.burgeriHind + this.valitudBurgeriLisandid.lisa3.hind;
        }
        if(valitudBurgeriLisandid.klientValibLisandid(valitudBurgeriLisandid.lisa4)){
            this.burgeriHind = this.burgeriHind + this.valitudBurgeriLisandid.lisa4.hind;
        }
        System.out.println("-----------------------------------------------------");
    }
    public void saadaTšekk(){
        this.valitudBurger.printBurger();
        this.valitudBurgeriLisandid.printLisandid();
        System.out.println("Teie arve on :" + this.burgeriHind);
    }
}
