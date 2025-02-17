package com.interview.question;

public class ReverseArray {
    public static void main(String[] args) {
        // Initialize the array with given values
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        // Find the length of the array
        int n = array.length;

        // Reverse the array without using an additional array
        int left = 0;
        int right = n - 1;

        while (left < right) {
            // Swap the elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }

        // Output: Display the reversed array
        System.out.println("The reversed array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
