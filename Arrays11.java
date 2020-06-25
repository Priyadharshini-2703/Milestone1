import java.util.Arrays;
import java.util.Scanner;

public class Arrays11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		boolean flag=only14(arr);
		System.out.println(flag);
		// TODO Auto-generated method stub

	}
public static boolean only14(int arr[]){
	int n=arr.length;
	boolean result=false;
	for(int i=0;i<n;i++){
		if(arr[i]==1||arr[i]==4){
			result=true;
		}
		else{
			result=false;
			break;
		}
	}
	return result;
}
}
