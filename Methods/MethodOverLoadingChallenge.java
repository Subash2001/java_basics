public class MethodOverLoadingChallenge {
    public static void main(String[] args) {

        System.out.println("5ft,& 8in = " + convertToCentimeter(5,8) + " cm");
        System.out.println("68in = " + convertToCentimeter(5,8) + " cm");

    }
    public static double convertToCentimeter(int inches){

        return inches* 2.54;
    }
    public static double convertToCentimeter (int feet, int inches){

        return convertToCentimeter((feet*12)+ inches);
        //int feetToInches = feet * 12;
        //int totalInches = feetToInches* + inches;
        //double result = convertToCentimeter(totalInches);
        //return result;
    }
}
