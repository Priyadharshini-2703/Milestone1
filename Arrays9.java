import java.util.Scanner;

public class Arrays9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int arr1[]=withoutTen(arr,n);
		for(int k=0;k<arr1.length;k++){
			System.out.println(arr1[k]);
		}
	}
		public  static int[] withoutTen(int[] arr,int n){
		for(int i=0;i<n;i++){
			if(arr[i]==10){
				arr[i]=0;
			}
		}
		int len=n;
		int[] temp1=new int[len];
		int j=0;
		for(int i=0;i<len;i++){
			if(arr[i]!=0){
				temp1[j]=arr[i];
				j++;
		}
			System.out.println();
			
	}
		return temp1;

}
}