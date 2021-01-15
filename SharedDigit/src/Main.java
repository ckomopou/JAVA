public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(34,33));
    }

    public static boolean hasSharedDigit(int first, int second) {

        if ((first >= 10) && (first<= 99) && (second >=10) && (second <=99)){
            int firstLastDigit = first % 10;
            int secondLastDigit = second % 10;
            first /= 10;
            second /=10;
            int firstFirstDigit = first;
            int secondFirstDigit = second;
            return ((firstFirstDigit == secondFirstDigit) || (firstFirstDigit == secondLastDigit) || (firstLastDigit == secondFirstDigit) || (firstLastDigit == secondLastDigit));
        }
        System.out.println("Invalid Input");
        return false;


    }





}
