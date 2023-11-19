import java.util.Scanner;

public class InvertPhrase {

    public static String invertPhrase(String input) {
        String[] words = input.split("\\s+");
        StringBuilder invertedPhrase = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            int index = word.length();
            for (int j = word.length() - 1; j >= 0; j--) {
                if (!Character.isLetterOrDigit(word.charAt(j)) && word.charAt(j) != '-') {
                    index = j;
                } else {
                    break;
                }
            }
            invertedPhrase.append(word, index, word.length()).append(word, 0, index);
            if (i > 0) {
                invertedPhrase.append(" ");
            }
        }

        return invertedPhrase.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a phrase:");
        String input = scanner.nextLine();

        String invertedOutput = invertPhrase(input);

        System.out.println("Inverted Output: " + invertedOutput);

        scanner.close();
    }
}
