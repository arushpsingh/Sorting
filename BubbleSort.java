// Bubble Sort time complexity : Worst ( O(n^2)), Average (Theta(n^2)), Best (Omega(n))

import java.util.*;
class Bubble{
 public static void bubbleSort(int arr[], int n){
  int temp;
  for(int i=0;i<n-1;i++){
   for(int j=i+1;j<n;j++){
    if(arr[i]>arr[j]){
     temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;
    }
   }
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
  bubbleSort(arr,n);
 }
}