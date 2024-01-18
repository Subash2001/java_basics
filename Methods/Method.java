public class Method {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 1000;
        int levelCompleted =5;
        int bonusScore =100;

        // Methods variables;just put method variable
        hangOn(gameOver,score,levelCompleted,bonusScore);
        hgeRing(true,800,5,300);
        isTOyoung(21);

        int highScore =  hgeRing (gameOver,score,levelCompleted,bonusScore);
        System.out.println("This is Final high score "+highScore);

        score =10000;
        levelCompleted =8;
        bonusScore=1000;
        hangOn(gameOver,score,levelCompleted,bonusScore);
       //you can use this type too... hangOn(true, 10000, 8, 1);
    }

    //methods
    public static void hangOn(boolean gameOver, int score, int levelCompleted, int bonusScore) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonusScore);
            finalScore += 1000;
            System.out.println("Your Final Score was " + finalScore);
        }
    }

    // using return type
    public static int hgeRing(boolean gameOver, int score, int levelCompleted, int bonusScore) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonusScore);
            finalScore += 1000;
        }
        return finalScore;
    }

    public static boolean isTOyoung (int age){
        boolean result = true;
        if (age<21){
            result = true;
        }
        return result;
    }
}