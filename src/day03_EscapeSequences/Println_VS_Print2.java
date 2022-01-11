package day03_EscapeSequences;

public class Println_VS_Print2 {

    public static void main(String[] args) {
        System.out.println("Knock Knock");  //first it prints knock knock, then it appends a new line
        System.out.println("Who is this?");

        System.out.println("This is Java");

        System.out.println("-------------------");

        System.out.print("Knock Knock");  // prints knock knock, does not append a new line
        System.out.print("Who is this?");
        System.out.print("This is Java");

        System.out.println();
        System.out.println("-------------------");
    }
}

// Single line comment goes here

/*
 */