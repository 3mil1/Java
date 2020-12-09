import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }


    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public void printLine() {
        Random random = new Random();

        for (int i = 0; i < this.width; i++) {
            double randomValue = random.nextDouble();

            if (randomValue > this.density) {
                System.out.print(" ");
            } else {
                System.out.println("*");
                this.starsInLastPrint = this.starsInLastPrint + 1;
            }
        }
    }

    public void print(){
        for(int i = 0; i <this.height; i++){
            printLine();
        }
    }

    public int starsInLastPrint(){
        return starsInLastPrint;

    }
}
