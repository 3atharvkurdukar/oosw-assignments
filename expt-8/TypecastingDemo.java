public class TypecastingDemo {

    public static void main(String[] args) {
        // Implicit type casting
        int i1 = 100;
        long l1 = i1;
        float f1 = l1;
        double d1 = f1;

        System.out.println("Int value " + i1);
        System.out.println("Long value " + l1);
        System.out.println("Float value " + f1);
        System.out.println("Double value " + d1);

        // Explicit  type casting
        double d2 = 2.64598e64;
        float f2 = (float) d2;
        long l2 = (long) d2;
        int i2 = (int) d2;

        System.out.println("\nDouble value " + d2);
        System.out.println("Float value " + f2);
        System.out.println("Long value " + l2);
        System.out.println("Int value " + i2);
    }
}