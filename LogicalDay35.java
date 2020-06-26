import java.util.Scanner;

public class LogicalDay35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("sum of last two digits "+addLastDigits(num1,num2));
		// TODO Auto-generated method stub

	}
	public static int addLastDigits(int num1,int num2){
		int rem1=0,rem2=0;
		rem1=num1%10;
		rem2=num2%10;
		if(rem1<0){
			rem1=-rem1;
		}
		if(rem2<0){
			rem2=-rem2;
		}
		/* if(rem1<0 && rem2<0){
			rem1=-rem1;
			rem2=-rem2;
		}*/
		return rem1+rem2;
	}

}
