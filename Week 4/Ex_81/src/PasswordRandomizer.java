import java.util.Random;

public class PasswordRandomizer {
    private final Random random;
    private final int length;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
       String symbols = "abcdefghijklmnopqrstuvwxyz";
       int i = 0;
       String pw = "";
       char symbol;

       while ( i < length){
           symbol = symbols.charAt(random.nextInt(length));
            pw += String.valueOf(symbol);
           i++;
       }
       return pw;
    }
}
    