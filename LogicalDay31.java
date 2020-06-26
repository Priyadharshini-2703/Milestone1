import java.util.Scanner;

public class LogicalDay31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(isEven(num));
		// TODO Auto-generated method stub

	}
	public static int isEven(int num){
		if(num%2==0){
			return 2;
		}else {
			return 1;
		}
		
	}

}
