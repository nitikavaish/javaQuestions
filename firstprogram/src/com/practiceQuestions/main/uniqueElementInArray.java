
package com.practiceQuestions.main;
// find unique element in array {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6}
public class uniqueElementInArray {
    public static void uniqueElement(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
           // boolean flag = true; // reset for each element
               int count =0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {  // khud se chodkar baki saare elemnt se compare karna hai
                    //flag = false; // duplicate found
                   count++;
                    //break;
                }
            }

            //if (flag)
            if(count==1)
            {
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
