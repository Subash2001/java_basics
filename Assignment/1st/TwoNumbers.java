import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        // Q : Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1st number : ");
        double num1 = input.nextDouble();
        System.out.print("Enter the 2nd number : ");
        double num2 = input.nextDouble();

        System.out.print("Enter the operator : + , - , * , / : ");
        char operator = input.next().charAt(0);

        double ans = 0;

        if (operator == '+') {
            ans = num1 + num2;
        } else if (operator == '-') {
            ans = num1 - num2;
        } else if (operator == '*') {
            ans = num1 * num2;
        } else if (operator == '/') {
            if (num2 !=0 ){
                ans = num1 / num2;
            }else {
                System.out.println("Divisible by zero is anything zero");
                return;
            }
        } else {
            System.out.println("Entered Invalid Operator");
        }
        System.out.println(ans);
    }
}
