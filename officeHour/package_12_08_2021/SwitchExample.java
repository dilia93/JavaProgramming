package package_12_08_2021;

public class SwitchExample {

    public static void main(String[] args) {

        String animal = "TIGER";
        String result = "";

        switch (animal) {
            case "DOG":
                result = "domestic animal";
                break;
            case "CAT":
                result = "domestic animal";
            case "TIGER":
                result = "wild animal";
                break;
            default:
                result="unknown animal";
                break;
        }
        System.out.println(result);
    }
}
/* Create  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal */