import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
           Syntax of for loop

           for (initialisation; condition; increment/decrement){
               // body
           }
        */

        // Qes- print Number 1 to 5
        for (int i=1; i<=5; i++){
            System.out.println(i);
        }

        // print number from user input
        Scanner input = new Scanner(System.in);
        int j = input.nextInt();

        for (int num = 1; num <=j ; num+=2) { // increment by +2
            System.out.println(num);
        }

        // while loop
        /*
           Syntax:
           while (condition) {
                 // body
                 operands
           }
        */
        int a = 1;
        while (a <= 69){
            System.out.println(a);
            a +=16;
        }

        // do while
        /*
           do {
              // body
           } while (condition);
           do while is first execute loop at least once and check the conditions continue loop until a specified condition become false
        */
        int n = 1;
        do {
            System.out.println("hello");
        }while (n !=1);
    }

}
/*
   for loop : when you know loop is how many times loop is going to run
   Ques : print the first ten numbers : for loop
   while loop : when you don't know how many times loop is going to run and the code is much cleaner should use while
   Ques : keep taking input from user

 */