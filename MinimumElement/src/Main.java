import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        

    }

    private static int readInteger(){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt() ;
        sc.close();
        return count;
    }

    private static int[] readElements(int size){
        Scanner sc = new Scanner(System.in);
        int [] myArray = new int[size];
        for (int i=0; i<myArray.length ; i++){
            myArray[i] = sc.nextInt();
        }
        sc.close();
        return myArray;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++){
            if (min < array[i]){
                min = array[i];
            }
        }
        return min;
    }

}

