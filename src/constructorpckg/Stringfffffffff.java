package constructorpckg;

import java.util.Scanner;

public class Stringfffffffff {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");
        String reversedSentence = "";

        // Reverse the words
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i]; // Concatenate each word
            if (i != 0) {
                reversedSentence += " "; // Add space between words
            }
        }

        // Display the reversed sentence
        System.out.println("Reversed Sentence: " + reversedSentence);


	}

}
