import java.util.Scanner;

public class LogicalDay32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(isOdd(num));
		// TODO Auto-generated method stub

	}
	public static int isOdd(int num){
		if(num%2!=0){
			return 2;
		}else {
			return 1;
		}
		
// TODO Auto-generated method stub

	}

}
