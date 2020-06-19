import java.util.Scanner;

public class FlowControlExercise5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char one=sc.next().charAt(0);
		int value=(int)one;
		if(value>=48&&value<=57){
			System.out.println("Digits");
		}
		else if(value>=65&&value<=90||value>=97&&value<=122){
			System.out.println("Alphabets");
		}
		else {
			System.out.println("Specialcharacters");
		}

		// TODO Auto-generated method stub

	}

}
