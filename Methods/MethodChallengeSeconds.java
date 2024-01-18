public class MethodChallengeSeconds {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));//3945
        System.out.println(getDurationString(-65, 45)); //65 ,45
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {

        //int minutes = seconds / 60;
        if (seconds < 0) {
            return "Invalid data for seconds ( " + seconds
                    + "), must be positive integer value";
        } else {
            return getDurationString(seconds / 60, seconds % 60);
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        if (minutes < 0) {
            return "Invalid data for minutes ( " + minutes
                    + "), must be positive integer value ";
        }
        if (seconds <= 0 || seconds >= 59) {
            return "Invalid data for seconds ( " + seconds
                    + " ) , must be between 0 and 59 value";
        }
        return hours + "h " + remainingMinutes + "m " + seconds + " s ";
    }
}
