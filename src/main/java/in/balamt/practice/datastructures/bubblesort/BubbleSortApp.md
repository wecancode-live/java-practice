Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. Here's a Java example of Bubble Sort:

```java
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Traverse through all elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no two elements were swapped, then the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array before sorting:");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("\nArray after sorting:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
```

In this example, the `bubbleSort` method takes an array of integers as input and sorts it using the Bubble Sort algorithm. The outer loop iterates through the array from the first element to the second-to-last element. The inner loop compares adjacent elements and swaps them if they are in the wrong order. The algorithm repeats this process until no more swaps are needed, indicating that the array is sorted. Finally, the `main` method demonstrates how to use the `bubbleSort` method to sort an array of integers and prints the array before and after sorting.