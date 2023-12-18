/*Write a method (and a program to test the method) called countVowels() that takes a String called phrase as its argument,

public static int countVowels(String phrase)

This method should count all of the vowels in the argument called phrase and return this count as an integer value.  
Note that vowels are the letters a, e, i, o, and u, and their uppercase variants. 
Also write a helper method called isVowel() that checks whether a character is a vowel.
 */

import java.util.Scanner;

public class HW12PartC {
    public static boolean isVowel(char ch) {
        if (ch == 'e' || ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else {
            return false;
        }
    }

    
    


    public static int countVowels(String phrase) {

        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.toLowerCase().charAt(i); //toLowerCase makes the letter lowercase so it counts upper case chars too :D
            if (isVowel(ch)) { //sees if isVowel is true
                count = count + 1;
            }
        }
        return count;
    }





    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter a string: ");
        String phrase = input.nextLine(); //make the string phrase
        int numVowels = countVowels(phrase); //use the countvowels method
        System.out.println(numVowels); 
    }
}