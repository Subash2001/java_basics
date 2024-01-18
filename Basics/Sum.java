import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1 value : ");
        int num1 = input.nextInt();
        System.out.print("Enter number2 value : ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of the num1 & num2 value : "+sum);
    }
}
