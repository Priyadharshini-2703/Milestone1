import java.util.Scanner;

public class FlowControlExercise1B {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int frstNum=sc.nextInt();
		int secNum=sc.nextInt();
		System.out.println(lastDigit(frstNum,secNum));
	}
	public static boolean lastDigit(int frstNum,int secNum){
		int numdigit=frstNum%10;
		int lastdigit=secNum%10;
		if(numdigit==lastdigit)
		{
			return true;
		}
		else{
			return false;
		}
		}
}

		// TODO Auto-generated method stub

	


