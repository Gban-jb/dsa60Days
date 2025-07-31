package dsa60Days;

public class recursionDay1 {
		  public static void main(String[] args) {
		    System.out.println("Welcome to Online Java!! Happy Coding :)");
		    int [] arr = {11,12,13,14,15,16,17,18,19};
		    int target = 14;
		    int s = 0;
		    int e = arr.length-1;
		    System.out.println(recursiveSearch(arr, s, e, target));
		  }
		  
		  public static int recursiveSearch(int [] arr, int s, int e, int target) {
		         if (s>e){
		             return -1;
		         }
		        int m = s + (e - s) / 2;
		        if (arr[m] == target) {
		            return m;
		        }
		        else if(arr[m] > target){
		            return recursiveSearch(arr, s, m-1, target);
		        }
		        else {
		            return recursiveSearch(arr, m+1, e, target);
		        }
		    }
		  
		}
