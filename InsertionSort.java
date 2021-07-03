// Insertion Sort time complexity : Worst ( O(n^2)), Average (Theta(n^2)), Best (Omega(n))
import java.util.*;
class Insertion{
 public static void insertion(int arr[], int n){
  for(int i=1;i<n;i++){
   int key = arr[i];
   int j = i-1;
   while(j>=0 && key<arr[j]){
    arr[j+1] = arr[j];
    j -= 1;
   } 
   arr[j+1] = key;
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
  insertion(arr,n);
 }
}