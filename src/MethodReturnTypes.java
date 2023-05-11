public class MethodReturnTypes {
    public static void main(String[] args) {
        System.out.println("This returns a string:  " + getString());
        System.out.println("This returns an integer:  " + getInteger());
        System.out.println("This returns a boolean value:  " + getBoolean());
    }
    public static String getString() {
        return "This returns a string";
    }
    public static int getInteger() {
        return 714;
    }
    public static boolean getBoolean() {
        return false;
    }
}
