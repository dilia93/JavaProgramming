package day34_GarbageCollection_AccessModifiers;

public class IphoneObject {

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("12", "Max", "white", 1200);

        System.out.println(iphone1);
        System.out.println("Iphone.brand = " + Iphone.brand);
        System.out.println("Iphone.OS = " + Iphone.OS);
        System.out.println("Iphone.isSmartPhone = " + Iphone.isSmartPhone);
        System.out.println("Iphone.madeIn = " + Iphone.madeIn);
        System.out.println("Iphone.designedIn = " + Iphone.designedIn);
        Iphone.printOperatingSystem();

    }
}










