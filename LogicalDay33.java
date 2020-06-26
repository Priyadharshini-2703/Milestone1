import java.util.Scanner;

public class LogicalDay33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("the last digit is "+lastDigit(num));
		
		// TODO Auto-generated method stub

	}
	public static int lastDigit(int num){
		int rem=0;
		
			while(num!=0){
				rem=num%10;
				break;
			}
			if(rem<0){
				return -rem;
			}else{
				return rem;
			}
     }
}
