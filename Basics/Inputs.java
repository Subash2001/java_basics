import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        /*
         * this for my understandings
         * input is a variable ; New means new function creating ; System.in means input from keyboard
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some input : ");
        int rollno = input.nextInt();
        /*
        * here roll number is a variable ;
        * input is a need give input which type ?
        * Int - is a data types need to declare
        * */
        System.out.println("Your roll Number is  " + rollno);

    }
}
