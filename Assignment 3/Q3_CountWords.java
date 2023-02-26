import javafx.concurrent.Worker;

public class Q3_CountWords {
    public static void main(String[] args) {
        String line = "The value of the local variable temp is not used";
        String[] words = line.split(" ");

        System.out.println(words.length);
    }
}
