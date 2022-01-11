package Homework;
import java.util.Scanner;
public class StringMiddleThree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE:

        //12345678   (4-1, 4+2)
        //HelloJava

        //midPoint --> 9/2=4
        //so we will need to get part of word
        //between 3 (midPoint -1) and 5 (midPoint +1)

        int num = word.length();
        if (num >= 5 && num % 2 == 1) {
            System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 2));
        } else {
            System.out.println("invalid");
        }
    }
}

/*
Given a String variable word print the middle three characters if the word is an odd number of characters and has more than 5 characters. If the word does not meet the requirements print invalid.

fifteen ==> fte
fifteen ==> fte
apple ==> ppl
apple ==> ppl
hey ==> invalid
hey ==> invalid
java ==> invalid
java ==> invalid
whatsup ==> ats
whatsup ==> ats
$ ==> invalid
 */
