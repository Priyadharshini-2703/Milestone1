import java.util.Scanner;

public class FlowControlExercise16 {

	public static void main(String[] args) {
		int n;
		int reverse = 0;
	    Scanner in = new Scanner(System.in);
	    n = in.nextInt();

	    while(n != 0)
	    {
	      reverse = reverse * 10;
	      reverse = reverse + n%10;
	      n = n/10;
	    }

	    System.out.println(reverse);

		// TODO Auto-generated method stub

	}

}
