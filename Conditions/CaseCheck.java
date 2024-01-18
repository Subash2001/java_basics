import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(2);

        if (ch >= 'a' && ch <='z'){
            System.out.println("LowerCase");
        }else {
            System.out.println("UpperCase");
        }
        /*
           trim means : remove the unwanted spaces
           index is start from zero
           charAt(index number) : means print the nth index of char
           eg:
           String word = "hello";
           System.out.println(word.charAt(4));
         */

    }
}
