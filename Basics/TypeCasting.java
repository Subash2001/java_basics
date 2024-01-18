public class TypeCasting {
    public static void main(String[] args) {

//        int num = input.nextInt();
//        float num = input.nextFloat();
//        System.out.println(num);
//
//        type casting
//        here only print integer value
//        integer is smaller than float

        int num = (int) (69.9f);
        System.out.println(num);

        // automatic type promotion in expressions
        // casting
        // 1 byte is equal to 256 so more than 256 not possible so integer only print
        int a = 257;
        byte b = (byte) (a);
        System.out.println(b);

        byte c = 25;
        byte d = 100;
        byte e = 69;
        int f = (c * d) /e;
        System.out.println(f);

        byte p = 54;
        char q = 'a';
        short r = 998;
        int s = 30530;
        float t = 89.67f;
        double u = 0.1234;
        double result = (t * p) + (s / q)-(u * r);
        System.out.println((t * p) + " "+ (s / q)+ " " +(u * r));
        /* larger value will print
        * float + int - double = double
        */
        System.out.println(result);

    }
}
