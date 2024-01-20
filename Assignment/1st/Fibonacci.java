import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //Q :  To calculate Fibonacci Series up to n numbers.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for N : ");

        // 0 +1 =1 ; 1 + 1 = 2 ; 1+2 =3 ; 2+3 = 5;..
        int n = input.nextInt();
        int a = 0;
        int b= 1;
        int count = 2;
        while (count <n){
            int temp = b;
            b = a + b;
            a = temp;
            count ++;
        }
        System.out.println(b);
    }
}
