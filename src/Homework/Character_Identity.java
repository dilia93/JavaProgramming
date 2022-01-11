package Homework;

public class Character_Identity {

    public static void main(String[] args) {

        char ch = 100;
        boolean digit = ch >= 48 && ch <= 57;
        boolean alphabet = ch >= 65 && ch <= 90 || ch >= 97 && ch <=122;

        if (digit){
            System.out.println("Digit");
        }else if (alphabet){
            System.out.println("alphabet");
        }else{
            System.out.println("Special Character");
        }



    }
}
