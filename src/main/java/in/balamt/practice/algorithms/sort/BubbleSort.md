    # Data Structure - Bubble Sort Algorithm
[Back to home](../../../../../../../../README.md)


----------------------------------------------------
Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison-based algorithm in which each pair of adjacent elements is compared and the elements are swapped if they are not in order. This algorithm is not suitable for large data sets as its average and worst case complexity are of Ο(n2) where n is the number of items.

```Performance degrades, as the item grows.```


####Bubble Sorting Algorithm:
1. Compare x and x + 1 values
2. If x+1 is smaller, swap
    1. Swap x + 1 to temp variable
    2. Swap x to x + 1 index
    3. Assign temp to x
    4. mark the swap has happened using boolean flag
3. Check if swap flag is true,
    1. If not swapped, break from the loop
    2. if swapped, continue the loop

###Let us see in detail with example
Objective is to compare the values and find the smallest and swap it to the left, if found right is smaller than left.


How Bubble Sort Works?
We take an unsorted array for our example. Bubble sort takes Ο(n2) time so we're keeping it short and precise.


| 14  | 33  | 27  | 35  | 10  |
|-----|-----|-----|-----|-----|


Bubble sort starts with very first two elements, comparing them to check which one is greater.


| ```14``` | ```33``` | 27  | 35  | 10  |
|----------|----------|-----|-----|-----|

In this case, value 33 is greater than 14, so it is already in sorted locations. Next, we compare 33 with 27.


| 14  | ```33``` | ```27``` | 35  | 10  |
|-----|----------|----------|-----|-----|

We find that 27 is smaller than 33 and these two values must be swapped.


| 14  | ```33``` | ```27``` | 35  | 10  |
|-----|----------|----------|-----|-----|
The new array should look like this −

| 14  | 27  | 33  | 35  | 10  |
|-----|-----|-----|-----|-----|
Next we compare 33 and 35. We find that both are in already sorted positions.

| 14  | 27  | ```33``` | ```35``` | 10  |
|-----|-----|----------|----------|-----|
Then we move to the next two values, 35 and 10.

| 14  | 27  | 33  | ```35``` | ```10``` |
|-----|-----|-----|----------|----------|
We know then that 10 is smaller 35. Hence they are not sorted.


| 14  | 27  | 33  | ```35``` | ```10``` |
|-----|-----|-----|----------|----------|
We swap these values. We find that we have reached the end of the array. After one iteration, the array should look like this −


| 14  | 27  | 33  | 10  | ```35``` |
|-----|-----|-----|-----|----------|
To be precise, we are now showing how an array should look like after each iteration. After the second iteration, it should look like this −


| 14  | 27  | 10  | ```33``` | ```35``` |
|-----|-----|-----|----------|----------|
Notice that after each iteration, at least one value moves at the end.

| 14  | 10  | ```27``` | ```33``` | ```35``` |
|-----|-----|----------|----------|----------|
And when there's no swap required, bubble sorts learns that an array is completely sorted.


| ```10``` | ```14``` | ```27``` | ```33``` | ```35``` |
|----------|----------|----------|----------|----------|

