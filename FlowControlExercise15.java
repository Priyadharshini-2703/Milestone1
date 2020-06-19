import java.util.Scanner;

public class FlowControlExercise15 {

	public static void main(String[] args) {
		if(args.length==0){
			System.out.println("Please enter a integer number");
			System.exit(0);		
		}
		int num=Integer.parseInt(args[0]);		
		for(int i=0;i<num;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
