import java.util.Scanner;

public class TwoNumbersLarge {
    public static void main(String[] args) {

        // Q : Take 2 numbers as input and print the largest number.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a>b){
            System.out.println("The largest number is " + a);

        }else {
            System.out.println("The largest number is " + b);
        }

    }
}
