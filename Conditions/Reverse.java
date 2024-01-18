public class Reverse {
    public static void main(String[] args) {
        /*
           Q : n = 23597 need to reverse
           Answer : 79532

           23597 / 10 : rem is 7.
           multiple 10 and adding last number
           7*10+9 = 79
           79*10+5 = 795
           795*10+3 = 7953
           7953*10+2 = 79532
         */

        int num = 2169;

        int ans =0;

        while (num>0){
            int rem = num % 10;
            num/=10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
