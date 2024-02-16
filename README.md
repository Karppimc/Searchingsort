# Searchingsort
This project was done for Programmin Languages 3 as final project. Program is done with Java and I used IntelliJ IDEA for it.

# How it works
In this part will explain and show proof of how code works. I will go through whole path from start to finish with different scenarios.
## MENU:
Menu has cases 1-4 as instructed Menu is in a loop and only q or Q shuts down the program:
![image](https://github.com/Karppimc/Searchingsort/assets/54446639/eccdb96a-9bb6-4a7b-8bef-a23ec9f6f77e)

If you press other numbers/letters you get text “Invalid choice. Please enter a valid option” And prompt comes again.

![image](https://github.com/Karppimc/Searchingsort/assets/54446639/97ef4e66-77a9-40d9-81d3-854555ae5d62)

## 1st Linear Search
Linear search is number one in the menu. Linear search basically goes through array that is defined in this case 0-9. Search goes through while loop and checks if index is equal to target value. Boolean found is defined as false and when index and target are equal it changes to true. Here’s some cases for this:

When you press one prompt asks you to decide which value you want to linear search 0-9

![image](https://github.com/Karppimc/Searchingsort/assets/54446639/7e421317-42f9-45b9-aa6a-561965a6bbd4)

When you select 2. You get answer found because it’s part of the values that are given.

![image](https://github.com/Karppimc/Searchingsort/assets/54446639/a2046f1e-51be-416e-8a4c-f461b6bff351)

If you select number outside of this range for example 12, you get answer not found.

![image](https://github.com/Karppimc/Searchingsort/assets/54446639/c08a4a68-bc3e-49ed-89f5-efcb574bce53)

## 2nd Binary Search
Binary search code uses same array as linear search. In the main class you can see array.sort method that sorts array’s values for binary search. Binary search uses array’s mid-point (min+max divided by 2) if target values is midpoint found is true and gives that value. If it isn’t binary search checks if target value is greater than or less than midpoint. After that it fetches target value.

Binary search is case 2. And first we search for value that is inside the array:

![image](https://github.com/Karppimc/Searchingsort/assets/54446639/c36f52ce-a043-42ab-8d4d-5f5d970529e9)

Next we check if we find values outside of the array:

![image](https://github.com/Karppimc/Searchingsort/assets/54446639/2a59f03a-5a3b-402c-877d-dd6d93165f8c)

## 3rd Insertion Sort
Third option is insertion sort. First we generate ten integers randomly between 0-99. The method itself compares element to the sorted array or sequence. It checks the position and if value is greater or less than. It starts from the right most value and moves to the left and inserts the elements to it’s rightful place.

When you press option 3. You get prompt where you can see data before insertion sorting and after that how they are sorted from lowest to highest value:

![image](https://github.com/Karppimc/Searchingsort/assets/54446639/e53c269e-f9d7-4795-b0d4-c3abe569ce40)

## 4th Quick Sort'
Fourth option is quick sort. As earlier we first generate array with random integers. Now values are from minus 50 to 49. After this, the last integer is selected as pivot for quick sort. It sorts less than values to the left and greater than values to the right. After that quick sort selects new last integers from these sub-arrays and does the sorting again. This continues until everything is sorted.

Quick sort is the fourth option in the menu. After that you get same data set and sorted data set after:

![image](https://github.com/Karppimc/Searchingsort/assets/54446639/6acc1565-a796-47de-b2bd-58baba9e2a46)










