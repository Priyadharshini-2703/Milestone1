import java.util.Arrays;

public class Arrays7 {
	 public static void main (String[] args) {  
	        int arr[] = {12,34,12,45,67,89}; 
	        int length = arr.length; 
	        Arrays.sort(arr);
	        int[] temp = new int[length];  
	        int j = 0;  
	        for (int i=0; i<length-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j++] = arr[length-1];       
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
	         
	      
	        for (int i=0;i<j; i++)  
	           System.out.print(arr[i]+" ");  
	    }
}
