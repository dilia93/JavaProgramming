package day24_CustomeMethod_Return;

public class Lunch1234 {

    public static void main(String[] args) {
        String word = "Level";
        System.out.println(Palindrome(word));
    }
        public static boolean Palindrome(String word){
        String reverse = "";
            for(int i = word.length()-1; i>= 0; i--) {
                reverse += word.charAt(i);}
            boolean isPalindrome = word.equalsIgnoreCase(reverse);

        return isPalindrome;
        }

    }

/*
4. By using the reverse method above to create another method named isPalindrome
that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
 */
