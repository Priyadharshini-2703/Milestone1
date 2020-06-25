import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {
		int arr[]={20,22,26,32,8,97};
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				flag=true;
				System.out.println(i);
				break;
			}
			else{
				flag=false;
			}
		}
		if(flag==false){
			System.out.println("-1");
		}

	}

}
