import java.util.ArrayList;

public class greatest {
    public static int greatest(ArrayList<Integer> list) {
        int max = list.get(0);
        for (Integer integer : list) {
            if (integer > max)
                max = integer;
        }
        return max;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }

}
