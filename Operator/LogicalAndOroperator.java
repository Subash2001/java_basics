public class LogicalAndOroperator {
    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false) // false
        {
            System.out.println("Its not a alien!");
        }

        //logical And operator;
        /*
         * if one statement is correct it will print false
         * if both statement is correct it will print true
         * if both statement is false it won't be  print
         */

        int topScore = 110;
        if (topScore < 100) {
            System.out.println("You got high score!");
        }

        int secondTopScore = 91;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Yeah u got second mark!");
        }

        /*Logical OR operator
         * IF one statement is correct it will be print true
         * If both statement is correct it will print true
         * If both statement is correct it will print false
         */
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either both or condition true");
        }

        /*Logical Not operator !
         * ItS TEST a boolean value ture or false
         * And print boolean opposite value
         * in this case boolean is true then it will be false
         *
         * */
        boolean isCar = false;
        if (isCar!=true) { //(!isCar) this shortcut
            System.out.println("Its not print");

        /*@else
        {
            System.out.println("its is alien");
        }*/

        }
    }
}
