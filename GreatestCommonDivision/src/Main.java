public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));

    }


    public static int getGreatestCommonDivisor(int first, int second) {

        if ((first < 10) || (second < 10)){
            return -1;
        }

        if ((first == second) || (second % first == 0)){
            return  first;
        }

        if ( first % second ==0 ){
            return second;
        }

        int greatest = 0;
        for (int i = 1; ((i <= first) && (i <=second)); i++ ){
            if((first % i == 0) && (second % i == 0)){
                greatest = i;
            }
        }
        return greatest;
    }

}
