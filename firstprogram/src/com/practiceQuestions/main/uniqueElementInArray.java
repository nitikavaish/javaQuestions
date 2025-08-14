
package com.practiceQuestions.main;
// find unique element in array {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6}
public class uniqueElementInArray {
    public static void uniqueElement(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean flag = true; // reset for each element

            for (int j = 0; j < n; j++) {
                if ( i!=j&&arr[i] == arr[j]) {  // khud se chodkar baki saare elemnt se compare karna hai
                    flag = false; // duplicate found
                    //break;
                }
            }

            if (flag) {
                System.out.println("Unique element is " + arr[i]);
                // break; // remove break if you want all unique elements
                //return; // stop after finding first unique
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        uniqueElement(arr);
    }
}
