public class Printing {
    private static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n");
        printSquare(4);
        System.out.println("\n");
        printRectangle(17, 3);
        System.out.println("\n");
        printTriangle(8);
    }

    private static void printSquare(int sideSize) {
        int i = 0;
        while (i < sideSize) {

            printStars(sideSize);

            i++;
        }
    }

    private static void printRectangle(int width, int height) {
        int i = 0;

        while (i < height) {
            printStars(width);

            i++;
        }
    }

    private static void printTriangle(int size) {
        int i = 0;

        while (i < size) {
            printStars(i);
            i++;
        }
    }


}
