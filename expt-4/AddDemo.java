public class AddDemo {

    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static String add(String s1, String s2) {
        return s1.concat(s2);
    }
    public static void main(String[] args) {
        System.out.println("Addition of 23 & 48 = " + add(23, 48));
        System.out.println("Addition of 91, 11 & 5 = " + add(91, 11, 5));
        System.out.println("Addition of \'Hello\' & \'Wolrd\' = " + add("Hello", "World"));
    }
}