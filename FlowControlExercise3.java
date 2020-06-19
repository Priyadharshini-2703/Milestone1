
public class FlowControlExercise3 {

	public static void main(String[] args) {
		int n=args.length;
		if(n==0){
			System.out.println("No values");
		}
		else{
			System.out.print(args[0]);
			for(int i=1;i<args.length;i++){
				System.out.print(","+args[i]);
			}
		}
		// TODO Auto-generated method stub

	}

}
