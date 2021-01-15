public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of digits is " + sumDigits(321));
    }



    public static int sumDigits(int number){
        if (number <10){
            return -1;
        }

        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            System.out.println(digit);
            sum += digit;

            number /= 10;
        }
        return sum;

    }




}
