public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (end < start || start < 0 || end < 0) {
            return -1;
        }
        int sum = 0;
        if (!isOdd(start)) {
            start++;
        }
        for (int i = start; i <= end; i += 2) {
            sum += i;
        }
        return sum;
    }


}
