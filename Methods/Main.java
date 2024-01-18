public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 8;
        int bonusScore = 200;


        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonusScore);
            System.out.println("Your final score was " + finalScore);
        }

        //challenge
        int existingScore = 10000;
        int levelComplete = 8;
        int bonusPoints = 200;
        int finalValue = existingScore;

        if (gameOver) {
            finalValue += (levelComplete * bonusPoints);
            System.out.println("Your Final score of second game is " + finalValue);
        }

        // this another type of duplicate
        gameOver = true;
        score = 4000;
        levelCompleted = 8;
        bonusScore = 200;
        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonusScore);
            System.out.println("Your final score was " + finalScore);
        }

    }
}