public class Sum3and5Challenge {
    public static void main(String[] args) {
        int countOfMatches = 0;
        int sumOfMatches = 0;
        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++){
            if ((loopNumber % 3 ==0) && (loopNumber % 5 == 0)){
                countOfMatches++;
                sumOfMatches += loopNumber;
                System.out.println("Found Match = " + loopNumber);
            }
            if (countOfMatches == 5){
                break;
            }
        }
        System.out.println("Sum of Matches= "+ sumOfMatches);
        for (int num =1; num > 0; num+=2){
            System.out.println("Number = " + num);
        }
    }
}
