import java.util.Scanner;
public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number to divide: ");
        double firstNum = scanner.nextInt();
        System.out.print("Enter the second number to divide by ");
        double secondNum = scanner.nextInt();
        divide(firstNum, secondNum);
    }
    public static void divide(double firstNum, double secondNum) {
        if (secondNum != 0) {
            double answer = firstNum / secondNum;
            System.out.println("The quotient(end result) is " + answer + ".");
        } else {
            System.out.println("Undefined. Bruh, you can't divide by 0");
        }
    }
}
