//Time complexity = O(n^2)

import java.util.*;
class Selection{
 public static void selection(int arr[], int n){
  int min,temp;
  for(int i=0;i<n;i++){
   min = i;
   for(int j=i+1;j<n;j++){
    if(arr[min]>arr[j]){
     min = j;
    }
   } 
   temp = arr[i];
   arr[i] = arr[min];
   arr[min] = temp;
  }
  for(int i=0;i<n;i++){
   System.out.print(arr[i]+" ");
  }
 }
 public static void main(String...args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<n;i++){
   arr[i] = sc.nextInt();
  }
  selection(arr,n);
 }
}