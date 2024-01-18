public class MethodChallenge {
    public static void main(String[] args) {

        int highSCorePosition = calculateHighScorePosition (1500);
        displayHighScorePosition(" vaishali", highSCorePosition);

        highSCorePosition = calculateHighScorePosition (1000);
        displayHighScorePosition(" Bob", highSCorePosition);

         highSCorePosition = calculateHighScorePosition (500);
        displayHighScorePosition(" hem ", highSCorePosition);

        highSCorePosition = calculateHighScorePosition (100);
        displayHighScorePosition(" subhash ", highSCorePosition);

        positiveNegativeZero(0,-1);
    }
    public static void displayHighScorePosition(String playerName, int highSCorePosition){
        System.out.println(playerName+" Manged into position " + highSCorePosition + " On the high scoreList");

    }

    public static int calculateHighScorePosition(int playerScore){
        int position =0;
        if (playerScore>=1000){
            position = 1;
        } else if (playerScore>=500) {
            position = 2;
        } else if (playerScore>=100) {
            position = 3;
        }
        else {
            position = 4;
        }
        return position;
    }
    //Exercise
    public static void positiveNegativeZero(int positive, int negative){

        if (positive>0){
            System.out.println("Positive");
        } else if (negative<0) {
                System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
