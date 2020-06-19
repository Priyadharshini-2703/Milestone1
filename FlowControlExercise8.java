import java.util.Scanner;

public class FlowControlExercise8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
	char c=sc.next().charAt(0);
	switch(c){
	case 'R':System.out.println("RED");
			break;
	case 'B':System.out.println("BLUE");
			break;
	case 'Y':System.out.println("YELLOW");
			break;
	case 'O':System.out.println("ORANGE");
			break;
	case 'G':System.out.println("GREEN");
			break;
	case 'W':System.out.println("WHITE");
			break;
	default:System.out.println("Inavlid code");
			
	}
		// TODO Auto-generated method stub

	}

}
