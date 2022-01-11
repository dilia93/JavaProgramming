package day16_ForLoopStringPractice;
import java.util.Scanner;
public class Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine(); //Java Java
        String name = "Java";
        int result = 0;


        for (int i = 0; i <= sentence.length()-4 ; i++) {
            if (sentence.substring(i , i+4).equalsIgnoreCase(name)) {
              result++;
            }
        }
        System.out.println(result);
    }
}


/*
write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */