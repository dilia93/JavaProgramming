package Day1_12_04_2021;

public class Hello {

    public static void main(String[] args) {

        /*
        Given a string, return a version without the first and last char, so "Hello" yields "ell".
        The string length will be at least 2.
         */

        String word = "Hello";

        String svar = word.substring(1, word.length() -1);
        System.out.println(svar);

        //or

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length()-1);
        word = word.replace(firstChar, ' ') + word.replace(lastChar,' ');

        System.out.println(word);



    }
}
