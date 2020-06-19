import java.util.Scanner;

public class FlowControlExercise6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int age=sc.nextInt();
		if(s=="Female"&& age>=1||age<=58){
			System.out.println("the percentage of interest is 8.2%");
		}
		else if(s=="Female"&& age>=59||age<=100){
			System.out.println("the percentage of interest is 9.2%");
		}
		// TODO Auto-generated method stub
		else if(s=="Male"&& age>=1||age<=58){
			System.out.println("the percentage of interest is 8.4%");
		}
		else if(s=="Male"&& age>=59||age<=100){
			System.out.println("the percentage of interest is 10.5%");
		}
		else{
			System.out.println("Invalid");
		}


		// TODO Auto-generated method stub

	}

}
