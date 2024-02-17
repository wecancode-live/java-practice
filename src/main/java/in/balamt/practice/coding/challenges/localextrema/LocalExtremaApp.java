package in.balamt.practice.coding.challenges.localextrema;

import in.balamt.practice.util.JavaPracticeUtils;

public class LocalExtremaApp {

    public static void main(String[] args) {
        //int[] input = {1,2,-1,0,-1};
        int[] input = {1,5,2,5};
        int outputCount = 0;

        //Increment the outputCount by 1
        // when input[x-1] < input [x] && input[x+1] < input
        // AND when input[x-1] > input [x] && input[x+1] > input
        //Ignore the First and Last item in the input array, because first item will not have left neighbour
        // item to the right of last item nothing will be available.

        outputCount = getExtremaCountInArray(input);
        JavaPracticeUtils.printLine("Count of extrema is ",outputCount);

    }

    private static int getExtremaCountInArray(int[] input) {
        int output=0;

        for(int i = 1; i < input.length - 1; i++){
            if(input[i - 1] < input[i] && input[i+1] < input[i]) {
                output+=1;
            }
            if(input[i - 1] > input[i] && input[i+1] > input[i]) {
                output+=1;
            }
        }

        return output;
    }
}
