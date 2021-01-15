public class EqualSumChecker {

    public static boolean hasEqualSum(int first, int second, int third){
        int suma =  first + second;
        if (suma == third){
            return true;
        }else {
            return false;
        }
    }
}

