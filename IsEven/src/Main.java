public class Main {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(22));

        System.out.println("********************************************************");

        int number = 4;
        int finishNumber = 20;
        int evenNumbersCount = 0;

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number " + number);

            evenNumbersCount++;
            if (evenNumbersCount >= 5){
                break;
            }
        }
        System.out.println("Total even numbers found: " + evenNumbersCount);


    }

    public static boolean isEvenNumber(int number){
            return (number % 2 == 0);
    }



}










