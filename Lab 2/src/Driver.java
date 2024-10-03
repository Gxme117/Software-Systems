import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a random sentence");
        String sentence = scanner.nextLine();



        WordProcessor wordProcessor = new WordProcessor();

        System.out.println(wordProcessor.countWords(sentence));
    }
}
