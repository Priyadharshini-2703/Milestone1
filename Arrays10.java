import java.util.Arrays;
//import java.util.Scanner;

public class Arrays10 {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int n=arr.length;
		oddEven(arr,n);
		/*int j=0,k=0;
		int even[]=new int[n];
		int odd[]=new int[n];
		
		for(int i=0;i<n;i++){
			if(arr[i]%2==0){
				even[j]=arr[i];
				j++;
			}
			else{
				odd[k]=arr[i];
				k++;
			}
		} 
		int len1 = j;
        int len2 = k;
        int[] result = new int[len1 + len2];

        System.arraycopy(even, 0, result, 0, len1);
        System.arraycopy(odd, 0, result, len1, len2);

        System.out.println(Arrays.toString(result));
		*/
	}
public static void oddEven(int arr[],int n){
	int j=0,k=0;
	int even[]=new int[n];
	int odd[]=new int[n];
	
	for(int i=0;i<n;i++){
		if(arr[i]%2==0){
			even[j]=arr[i];
			j++;
		}
		else{
			odd[k]=arr[i];
			k++;
		}
	} 
	int len1 = j;
    int len2 = k;
    int[] result = new int[len1 + len2];

    System.arraycopy(even, 0, result, 0, len1);
    System.arraycopy(odd, 0, result, len1, len2);

    System.out.println(Arrays.toString(result));

}
}
