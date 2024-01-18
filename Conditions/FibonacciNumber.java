import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        /*
           FibonacciNumber is an adding last two numbers.
           let say start with  0 eg :
           0,1 =1
           0,1,1 =  1+1 =2
           0,1,1,2.... so on

         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count =2;

        while (count <= n){
            int temp = b;
            b = a+b;
            a = temp;
            count++;
        }
        System.out.println(b);


    }
}
