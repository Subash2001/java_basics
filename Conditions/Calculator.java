import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input frm user
        int ans =0;
        while (true) { // infinite loop
            // take operator is an input
            System.out.print("Enter the operators : ");

            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '%' || op == '/' || op == '*') {
                // two inputs
                System.out.print("Enter two numbers : ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '*') {
                    ans = num1 / num2;
                }
                } else if (op == 'x' || op == 'X') {
                    break;
                } else {
                    System.out.println("Invalid operation!!");
                }
            System.out.println(ans);
        }
    }
}
