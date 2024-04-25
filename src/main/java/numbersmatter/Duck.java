package numbersmatter;

public class Duck {
    String size;

    Duck() {
        this.size = "Very big";
    }

//    public static void thisDuckSizeInIntValue() {
//        if (this.size.equals("Very big")) {
//            System.out.println(5);
//        } else {
//            System.out.println(4);
//        }
//    }

    public static void thisDuckSizeInIntValue(Duck duck) {
        if (duck.size.equals("Very big")) {
            System.out.println(10);
        } else {
            System.out.println(4);
        }
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        Duck.thisDuckSizeInIntValue(duck);
    }
}
