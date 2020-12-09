public class Burger {

    // KAPSELDUS

    String nimi, sai, liha;
    Double hind;
    public Burger(String nimi, String sai, String liha, double hind) {
        this.nimi = nimi;
        this.sai = sai;
        this.liha = liha;
        this.hind = hind;
    }
    public Burger( String nimi, String liha, double hind) {
        this.nimi = nimi;
        this.sai = "Teravilja sai";
        this.liha = liha;
        this.hind = hind;
    }

    public void printBurger(){
        System.out.println("Burger: " + this.nimi + " | "+ this.sai + " | "+ this.liha + " | "+ this.hind);
    }
}
