import java.util.ArrayList;
import java.util.Scanner;

public class amount {

    public static int countItems(ArrayList<String> list){
        return list.size();
    }

    public static void print(ArrayList<String> printed) {
        for (String word : printed) {
            System.out.println( word );
        }
    }

    public static void removeFirst(ArrayList<String> list) {
        list.remove(0);  // removes the first item (indexed 0)
    }



    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items in the list:");
        System.out.println(countItems(list));


        ArrayList<String> programmingLanguages = new ArrayList<String>();
//        programmingLanguages.add("Pascal");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("C++");

        print(programmingLanguages);

        removeFirst(programmingLanguages);

        System.out.println();  // prints an empty line

        print(programmingLanguages);
    }


}
