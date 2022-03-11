// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// First sort the array, then calculate the average = sum / num; then for next-Sum; avg + avg/(remaining number cnt) = new avg; if the new avg is > the next number then for the next : newAvg + (newAvg - num[i])/ cnt of remaining number, else set the avg to all rest of the elemnt
// Your code here along with comments explaining your approach


import java.io.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        double [] arr = {0,3,1,6,8};
        double sum = 12.5;
        int n = arr.length;
        double [] res = new double [n];
        double avg = sum/n;
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            if(avg > arr[i]){
                double dif = avg - arr[i];
                avg = avg + dif/(n-i+1);
                res[i] = arr[i];
            }else{
                res[i] = avg;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println("ans : "+ res[i]);
        }

    }
}
