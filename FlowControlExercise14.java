import java.util.Scanner;

public class FlowControlExercise14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rem=0,sum=0;
		int num=sc.nextInt();
		while(num!=0){
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
