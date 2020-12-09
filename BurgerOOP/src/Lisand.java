public class Lisand {

    // KAPSELDUS

    String nimi;
    Double hind;
    public Lisand(String a, Double b) {
        this.nimi = a;
        this.hind = b;
    }
    public void prindiLisa(){
        System.out.println("Lisand: " + this.nimi + " | Hind: " + this.hind);
    }
    public Double getLisaHind(){
        return this.hind;
    }
    public String getLisaNimi(){
        return this.nimi;
    }
}