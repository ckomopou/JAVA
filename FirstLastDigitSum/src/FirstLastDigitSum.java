public class FirstLastDigitSum {


    static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        if (number <= 9) {
            number += number;
            return number;
        }
        int num = number;
        int sumFirstAndLast = 0;
        int useDigit;
        while (num > 0) {
            useDigit = num % 10;
            if (num == number || (num > 0 && num < 10)) {
                sumFirstAndLast += useDigit;
            }
            num = num / 10;
        }
        return sumFirstAndLast;
    }



}
