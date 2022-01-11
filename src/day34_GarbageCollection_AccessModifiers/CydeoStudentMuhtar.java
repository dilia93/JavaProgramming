package day34_GarbageCollection_AccessModifiers;

public class CydeoStudentMuhtar {

    public String name;
    public char gender;
    public int age;
    public int groupNumber;


    public static int number;
    public static String schoolName;
    public static String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudentMuhtar(String name, char gender, int age, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.groupNumber = groupNumber;


    }
    static {
        number = 25;
        schoolName="Cydeo";
        fieldOfStudy="SDET";
        programmingLanguage="JAVA";
        secretCode="Wooden Spoon";

    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }
    public static void printSecretCode(){
        System.out.println(secretCode);
    }
    public void attendClass(){
        System.out.println(name + " is attending");
    }
    public void study(){
        System.out.println(name + " is studying");
    }


    public String toString() {
        return "CydeoStudentMuhtar{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                '}';
    }
}


/*
create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */