package questions;

public class Fifteen {

    //Question 1
    public static int getLastIndex(String[] names) {
        return(names.length-1);
    }

    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        return(names.length-2);
    }

    //Question 3
    public static String getFirstElement(String[] names) {
        return(names[0]);
    }

    //Question 4
    public static String getLastElement(String[] names) {
        return(names[4]);
    }

    //Question 5
    public static String getSecondToLastElement(String[] names) {
        return(names[3]);
    }

    //Question 6
    public static int getSum(int[] numbers) {
        int sum = 0;
        for (int x = 0; x < numbers.length; x++) {
            sum += numbers[x];
        }
        return sum;
    }

    //Question 7
    public static int getAverage(int[] numbers) {
        int sum = 0;
        for (int y = 0; y < numbers.length; y++) {
            sum += numbers[y];
        }
        int average = (int) sum / numbers.length;
        return average;
    }

    //Question 8
    public static String extractAllOddNumbers(int[] numbers) {

        return null;
    }

    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        return null;
    }

    //Question 10
    public static boolean contains(String[] names, String element) {
        int p = 0;
        for (p = 0; p < names.length; p++)
        if (names[2].equals("Darius")){
            return true;
        }
        return false;
    }

    //Question 11
    public static int getIndexByElement(String[] names, String element) {
        int k = 0;
        for (k = 0; k < names.length; k++) {
            if (names[k] == element) {
                return k;
            }
        }
            return -1;
        }

    //Question 12
    public static void printOddNumbersInRange(int start, int end){

        int r;
        for (r = 1; r <= 9; r++);
        if (r % 2 != 0){
            System.out.println(r);

        }

    }

    //Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        return null;
    }

    //Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        return null;
    }

    //Question 15
// Write a java method to count all the words in a string

    /* public static int WordsInAStringCounter(String str){
    return null;
    } */

    public static void main(String[] args) {

        String[] names ={"Jaimi", "Edwin", "Darius", "Alfonza", "Sebastian"};
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(getLastIndex(names));
        System.out.println(getSecondToLastIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println(getLastElement(names));
        System.out.println(getSecondToLastElement(names));
        System.out.println(getSum(numbers));
        System.out.println(getAverage(numbers));
        //System.out.println(extractAllOddNumbers());
        //System.out.println(extractAllEvenNumbers());
        System.out.println(contains(names, "Darius"));
        System.out.println(getIndexByElement(names, "Edwin"));
        printOddNumbersInRange(1,9);





    }
}
