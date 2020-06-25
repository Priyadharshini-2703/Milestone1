import java.util.Scanner;

//import java.util.Scanner;

public class Arrays8 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a = 0,b = 0,sum=0;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(arr[i]==6){
				a=i;
			}
			else if(arr[i]==7){
				b=i;
			}
		}
		if(a<b){
			for(int i=0;i<n;i++){
				if(i<a||i>b){
					sum=sum+arr[i];
				}
			}
		}
		else{
			for(int i=0;i<n;i++){
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
		
		
	}

	}
