public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        int a = 0;
        for (int num : array) {
             a += num;
        }

        return a;
    }
}