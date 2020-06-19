import java.util.Scanner;
public class FlowControlExercise4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char one=sc.next().charAt(0);
		char two=sc.next().charAt(0);
		if((int)one>(int)two){
			System.out.println(two+" "+one);
		}
		else{
			System.out.println(one+" "+two);
		}
		
		// TODO Auto-generated method stub

	}

}
