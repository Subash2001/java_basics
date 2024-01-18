public class SwitchChallengeEnhanced {
    public static void main(String[] args) {

        int day = 7;
        System.out.println(day +" is the " + printDayOfWeek(day) + " day");
        System.out.println(day +" is the " + printDayOfWeeks(day) + " day");
    }
    public static String printDayOfWeek (int day){
        switch (day) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
        }

    return "Invalid Day ";
    }

    public static String printDayOfWeeks (int day){
        if (day == 0) {
            return "Sunday";
        } else if (day == 1) {
            return "Monday";
        } else if (day == 2) {
            return "Tuesday";
        } else if (day == 3) {
            return "Wednesday";
        } else if (day == 4) {
            return "Thursday";
        } else if (day == 5) {
            return "Friday";
        } else if (day == 6) {
            return "Saturday";
        }

        return "Invalid Day ";
    }
}
