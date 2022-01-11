package day13_String;

public class Level {

    public static void main(String[] args) {
        String word = "Level";


        char firstLetter = word.charAt(0);
        System.out.println("firstLetter = " + firstLetter);




        char lastChar = word.charAt( word.length()-1);
        System.out.println("lastChar = " + lastChar);


        if(firstLetter == lastChar  ){
            System.out.println("First and last letters are not the same");
        }else{
            System.out.println("First and last letters are  the same");
        }
    }
}


/*write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

 */