import java.util.ArrayList;

public class lengthOfString {
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (String len : list){
            nums.add(len.length());
        }
        
        return nums;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }
}
