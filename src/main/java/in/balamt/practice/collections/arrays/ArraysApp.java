package in.balamt.practice.collections.arrays;

public class ArraysApp {

    /**
     * ArraysApp.main(args)
     * @param args String
     */
    public static void main(String[] args) {
        /**
         * Int Array - Creating Integer Array, with Size of 7.
         * We need to provide Array size, and it cannot be changed once the program is running.
         *
         */
        int[] intArray = new int[7];
        /**
         * Indices starts from 0 for Array
         */
        intArray[0] = 20;
        intArray[1] = 35;
        //Inserting not in order, but it adds the value to specified index location.
        intArray[5] = 1;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[6] = -22;

        for (int i = 0; i < intArray.length;i++) {
            System.out.println(intArray[i]);
        }

        int index = -1;
        for (int i = 0; i < intArray.length;i++) {
            if(intArray[i] == 7){
                index = i;
                break;
            }
        }

        System.out.println("index " + index);
    }
}
