import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int number){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + number + "integer values. \r");
        int[] values = new int[number];
        for (int i=0; i<values.length; i++){
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }


    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++) {
            sortedArray[i] = array[i];
        }
        int temp;
        for(int i=0; i<sortedArray.length; i++) {
            for(int j=i+1; j<sortedArray.length; j++) {
                if(sortedArray[i] < sortedArray[j]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }

        return sortedArray;
    }

}
