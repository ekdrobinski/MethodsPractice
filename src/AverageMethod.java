import java.util.Scanner;
public class AverageMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number:");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number:");
        double num3 = scanner.nextDouble();
        double avg = average(num1, num2, num3);
        System.out.println("The average is: " + avg);
    }
    public static double sum(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
    public static double average(double num1, double num2, double num3) {
        double sum = sum(num1, num2, num3);
        return  sum / 3;
    }
}
