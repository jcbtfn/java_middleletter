/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package middleletters_java;

import java.util.Scanner;

public class App {

    public static String get_middle(String word){
        if (word.length() % 2 == 0) {
            return "" + word.charAt(word.length()/2-1) + word.charAt(word.length()/2);
        }
        return "" + word.charAt(word.length()/2);
    }

    public static void main(String[] args) {
        System.out.print("Please input the word: ");
        Scanner userLetterInput = new Scanner(System.in);
        String letterInput = userLetterInput.nextLine();
        System.out.println("Middle letters: " + get_middle(letterInput));
    }
}
