package day34_GarbageCollection_AccessModifiers;


    public class Iphone {
        public String model;
        public String size;
        public String color;
        public double price;

        public static String brand;
        public static String OS;
        public static boolean isSmartPhone;
        public static String madeIn;
        public static String designedIn;

        public Iphone(String model, String size, String color, double price) {
            this.model = model;
            this.size = size;
            this.color = color;
            this.price = price;
        }

        static {
            brand = "Iphone";
            OS = "IOS";
            isSmartPhone = true;
            madeIn = "China";
            designedIn = "USA";
        }

        public static void printOperatingSystem() {
            System.out.println("OS = " + OS);
        }

        public void call(long phoneNumber) {
            System.out.println(phoneNumber + " is calling");
        }

        public void text(long phoneNumber) {
            System.out.println(phoneNumber + " is texting");
        }

        public void faceTime(long phoneNumber) {
            System.out.println(phoneNumber + " is Facing");
        }

        public void faceTime(String email) {
            System.out.println(email + " is Facing");
        }

        public String toString() {
            return "Iphone{" +
                    "model='" + model + '\'' +
                    ", size='" + size + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    '}';
        }
    }




