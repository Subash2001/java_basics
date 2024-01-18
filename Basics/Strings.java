import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String using Scanner
        String name = input.nextLine();
        // here input.nextLine is an entire line will be printed
        System.out.println(name);
        String random = input.next();
        // here input.next is first word will be printed
        System.out.println(random);
        // long integer using Scanner
        long num = input.nextLong();
        System.out.println(num);
        // integer number using Scanner
        int num1 = input.nextInt();
        System.out.println(num1);
        // short number using Scanner
        short num2 = input.nextShort();
        System.out.println(num2);
        // float using Scanner
        float num3 = input.nextFloat();
        System.out.println(num3);
        // double using Scanner
        double num4 = input.nextDouble();
        System.out.println(num4);
        // boolean using Scanner
        boolean naa = input.nextBoolean();

    }
}
