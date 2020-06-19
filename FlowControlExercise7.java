
public class FlowControlExercise7 {

	public static void main(String[] args) {
		char value=sc.next().charAt(0);
		String s=Character.toString(value);		
		if(value>='a'&&value<='z'){	
			System.out.println(s.toUpperCase());
		}
		else{
			
			System.out.println(s.toLowerCase());
		}	}

}
