public class PrintingLikeBoss {
    public static void main(String[] args) {
        int xmas = 30;
        printTriangle(5);
        System.out.print("\n");
        xmasTree(xmas);
        xmasTreeStand(xmas);
    }

    private static void printWhitespaces(int size) {
        int i = 0;
        while (i < size) {
            System.out.print(" ");
            i++;

        }
    }

    private static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    private static void printTriangle(int size) {
        int i = 1;

        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }
    }

    private static void xmasTree(int height) {
        int i = 1;
        int stars = 1;

        while (i <= height) {
            printWhitespaces(height - i);
            printStars(stars);
            i++;
            stars += 2;
        }

    }

    private static void xmasTreeStand(int height) {
        int i = 1;
        while (i <= 2) {
            printWhitespaces(height-2);
            printStars(3);
            i++;
        }
    }
}
