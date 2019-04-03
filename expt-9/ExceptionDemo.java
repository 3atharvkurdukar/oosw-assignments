import java.util.*;

class NotEvenException extends Exception {
    public String toString() {
        return ("NotEvenException: The number is not even.");
    }
}

public class ExceptionDemo {
    public static void checkEven(int x) throws NotEvenException {
        if (x % 2 == 0)
            System.out.println("It is an even number!");
        else
            throw (new NotEvenException());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number : ");
            int number = sc.nextInt();
            checkEven(number);
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
