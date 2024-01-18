public class CountingOccurrences {
    public static void main(String[] args) {
        int n = 45369;

        int count = 0;
        while (n>0){
            int rem = n % 10;
            if (rem == 5){  // why rem 5 digit ? : bcz it an 5 digit number
                count++;
            }
            n = n/10; // n/=10;  why n ? : Updating n by Removing Last Digit:
        }
        System.out.println(count);
    }
}
