import java.util.Scanner;

public class Lisandid {

    // KAPSELDUS

    Lisand lisa1, lisa2, lisa3, lisa4;

    public Lisandid(Lisand lisa1, Lisand lisa2, Lisand lisa3, Lisand lisa4){
        this.lisa1 = lisa1;
        this.lisa2 = lisa2;
        this.lisa3 = lisa3;
        this.lisa4 = lisa4;
    }
    public void printLisandid(){
       this.lisa1.prindiLisa();
       this.lisa2.prindiLisa();
       this.lisa3.prindiLisa();
       this.lisa4.prindiLisa();
    }

    // PÄRILUS

    public boolean klientValibLisandid(Lisand lisa){
        System.out.println("Kas sa soovid: " + lisa.getLisaNimi() + " "+ lisa.getLisaHind());
        System.out.print("Kirjuta jah kui sa soovid: ");
        Scanner reader= new Scanner(System.in);
        String command = reader.nextLine();
        if(command.equals("jah")){
            System.out.println(lisa.getLisaNimi() + " on lisatud.");
            return true;
        } else{
            System.out.println(lisa.getLisaNimi() + " ei ole lisatud.");
            System.out.println(command);
            return false;
        }
    }
}
