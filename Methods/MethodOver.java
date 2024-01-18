public class MethodOver {
    public static void main(String[] args) {
        int newScore = calculateScore("subash", 900);
        System.out.println(newScore);

    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName + " Scored " + score);
    return score*1000;
    }

    //Method OverLoading
    public static int calculateScore( int scoreCard){
        System.out.println("Unnamed Player Scored " + scoreCard);
        return scoreCard*1000;
    }

}
