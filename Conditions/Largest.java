import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Q : Find the largest of the 3 Numbers
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The Maxim Number is = " + max);

        // another method
        int maxi = 0;
        if (a > b) {
            maxi = a;
        } else {
            maxi = b;
        }
        if (c > maxi) {
            maxi = c;
        }
        System.out.println(maxi);

        // another method
//        int max = Math.max( c ,Math.max(a, b));
//        System.out.println(max);
    }
}
