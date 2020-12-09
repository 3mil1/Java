import java.util.ArrayList;
import java.util.Collections;

public class combArr {
    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        first.addAll(second);
    }

    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
        for (Integer number : second) {
            if (!first.contains(number)) {
                first.add(number);
            }
        }
    }

    public static void smartCombine1(ArrayList<Integer> first, ArrayList<Integer> second) {
        for (Integer number : second) {
            if (!first.contains(number)) {
                first.add(number);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

//        combine(list1, list2);
//
//        System.out.println(list1); // prints [4, 3, 5, 10, 7]
//
//        System.out.println(list2); // prints [5, 10, 7]

        System.out.println("-----");

        System.out.println(list1);
        System.out.println(list2);
        System.out.println("-----");

        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("-----");

        System.out.println(list1);
        System.out.println(list2);
        System.out.println("-----");

        smartCombine1(list1, list2);
        System.out.println(list1);
        System.out.println(list2);

    }
}


//import java.util.ArrayList;
//import java.util.Collections;
//
//public class combArr {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        ArrayList<Integer> list2 = new ArrayList<Integer>();
//
//        Collections.addAll(list1, 4, 3);
//
//        Collections.addAll(list2, 5, 10, 4, 3, 7);
//
//        // remove comment when method ready
//
//        System.out.println(list1);
//        System.out.println(list2);
//
//        smartCombine(list1, list2);
//        System.out.println(list1);
//        System.out.println(list2);
//    }
//
//    public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
//        for (Integer number : list2) {
//            if (!list1.contains(number)) {
//                list1.add(number);
//            }
//        }
//    }

