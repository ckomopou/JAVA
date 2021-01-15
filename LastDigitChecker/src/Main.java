public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println("*********************************************************");
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));


    }



    public static boolean hasSameLastDigit(int first, int second, int third){

        if ((first >= 10) && (first <=1000) && (second >= 10) && (second <=1000) && (third >= 10) && (third <=1000)){

            int firstNumberLastDigit = first % 10;
            int secondNumberLastDigit = second % 10;
            int thirdNumberLastDigit = third % 10;

            if ((firstNumberLastDigit == secondNumberLastDigit) || (secondNumberLastDigit == thirdNumberLastDigit) ||(firstNumberLastDigit == thirdNumberLastDigit)){
                return true;
            }
            return false;
        }
        return false;
    }


    public static boolean isValid(int number){
        if ((number >= 10) && (number <=1000)){
            return true;
        }
        return false;

    }




}
