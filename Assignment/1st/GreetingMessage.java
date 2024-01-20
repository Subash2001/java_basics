import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
       // Q :  Take name as input and print a greeting message for that particular name.
        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println( "How are you ?" + name);
    }

}
