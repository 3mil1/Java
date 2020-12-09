public class StringUtils {
    public static boolean included(String word, String searched) {
        if(word == null || searched == null ){
            return false;
        }
        return word.trim().toUpperCase().contains(searched.trim().toUpperCase());
    }
}
