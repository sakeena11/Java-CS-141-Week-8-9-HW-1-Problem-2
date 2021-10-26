import java.util.*; //import Scanner, Random, and Arrays classes

public class SumAbove {
    public static void main(String[] args) {
        //create a Scanner to get the seed for the random number generator

        Scanner scnr = new Scanner(System.in);
        int seed = scnr.nextInt();
        Random rand = new Random(seed);

        //ask for the input "minimum" value to search with
        System.out.println("Enter a positive integer between 1-100 to search above:");
        int minVal = scnr.nextInt();

        //create an array of random integers (1-100)
        //the length of the array will also be randomly determined (1-30)
        int[] arr = new int[rand.nextInt(100) + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        System.out.println(Arrays.toString(arr));

        int totalVal = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > minVal) {
                totalVal = totalVal + arr[i];
            }
        }
        System.out.println(totalVal);
    }
}