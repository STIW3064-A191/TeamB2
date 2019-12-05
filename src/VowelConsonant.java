import java.util.Arrays;
import java.util.Scanner;

public class VowelConsonant {

    private static char[] vowel(String input){
        return input.replaceAll("[^A-Za-z]+", "").replaceAll("[^AEIOUaeiou]","").toCharArray();
    }
    private static char[] consonant(String input){
        return input.replaceAll("[^A-Za-z]+", "").replaceAll("[AEIOUaeiou]","").toCharArray();
    }

    public static void main(String []args){

        System.out.print("Input: ");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Output:");
        System.out.println("Vowel "+ Arrays.toString(vowel(input)));
        System.out.println("Consonant "+ Arrays.toString(consonant(input)));
    }
}
