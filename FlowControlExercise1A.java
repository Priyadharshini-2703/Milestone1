import java.util.Scanner;

public class FlowControlExercise1A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<0){
			System.out.println("Negative number");
		}
		else if(num>0){
			System.out.println("Positive number");
		}
		else{
			System.out.println("Zero");
		}
		// TODO Auto-generated method stub

	}

}
