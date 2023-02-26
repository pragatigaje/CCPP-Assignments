package Ass1;

public class ReverseWords {
    public static void main(String[] args) {
        String line = "I Love India";
        String[] words = line.split(" ");

        for (int i = 0; i < words.length ; i++) {
            System.out.println(words[i]);
        }
        
        
    }
}
