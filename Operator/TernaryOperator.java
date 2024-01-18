public class TernaryOperator {
    public static void main(String[] args) {
        String mkeCar = "Volkswagen";

        /*Ternary operator
        * it const's three operand one boolean variable ; another two is value
        * mkeCar == "Volkswagen" ? false : true;
        * here this conditions is true it will false;
        * otherwise this condition is false it will be true
        * here Volkswagen is condition
        * u need to define boolean variable in if condition
        * */

        boolean itDomestic = (mkeCar == "Volkswagen") ? false : true;

        if (itDomestic){
            System.out.println("This car domestic in india");
        }
        String s = (itDomestic) ? ("This car domestic in india"):("This car is not domestic in india");
        System.out.println(s);


        //challenge
        double var1 = 20.00d;
        double var2 = 80.00d;
        double result = (var1+var2)*100 ;
        System.out.println("My remainder value = " + result);
        double theRemainder = result % 40.00d;
        System.out.println("TheRemainder = "+theRemainder);
        boolean isNoRemainder = (theRemainder==0) ? true : false;
        System.out.println("isNoRemainder"+isNoRemainder );
        if (!isNoRemainder){
        System.out.println("Got some remainder");
        }

    }
}
