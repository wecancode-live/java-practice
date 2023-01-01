package in.balamt.practice.algorithms.sort;

public class BubbleSortApp {

    /**
     * BubbleSort
     * Performance degrades, as the items grows.
     * <p>
     * Bubble Sorting Algorithm:
     * 1. Compare x and x + 1 values
     * 2. If x+1 is smaller, swap
     * 2.1 Swap x + 1 to temp variable
     * 2.2 Swap x to x + 1 index
     * 2.3 Assign temp to x
     * 2.4 mark the swap has happened using boolean flag
     * 3. Check if swap flag is true,
     * 3.1 If not swapped, break from the loop
     * 3.2 if swapped, continue the loop
     * <p>
     * Objective is to compare the values and find the smallest and swap it to the left, if found right is smaller than left.
     *
     * @param args
     */

    public static void main(String[] args) {
        //flag to check if swap happened
        boolean swapped = false;
        // Array Size
        int arraySize = 9;
        // Declaring Integer Array
        int[] numArray = new int[arraySize];
        // Initialize values
        numArray[0] = 4;
        numArray[1] = 8;
        numArray[2] = 1;
        numArray[3] = 2;
        numArray[4] = 7;
        numArray[5] = 3;
        numArray[6] = 9;
        numArray[7] = 6;
        numArray[8] = 5;

        // Starting to loop from the beginning of the array
        for (int x = 0; x < arraySize - 1; x++) {
            // Starting to loop from the beginning
            for (int y = 0; y < arraySize - x - 1; y++) {
                swapped = isSwapped(swapped, numArray, y);
            }
            if (!swapped) {
                break;
            }
        }
        printOutput(numArray);

    }

    private static boolean isSwapped(boolean swapped, int[] numArray, int y) {
        if (numArray[y + 1] < numArray[y]) {
            int temp = numArray[y + 1];
            numArray[y + 1] = numArray[y];
            numArray[y] = temp;
            swapped = true;
        }
        return swapped;
    }

    public static void printOutput(int[] numbers) {
        for (int x = 0; x < numbers.length; x++) {
            System.out.print("| " + numbers[x] + " ");
        }
    }
}
