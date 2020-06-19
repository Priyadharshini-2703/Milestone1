
public class FlowControlExercise17 {

	public static void main(String[] args) {
		 int rem,sum=0,temp;    
		  int num=Integer.parseInt(args[0]);
		  temp=num;    
		  while(num>0){    
		   rem=num%10;  
		   sum=(sum*10)+rem;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(temp+" is a palindrome ");    
		  else    
		   System.out.println(temp+" is not a palindrome");    

		// TODO Auto-generated method stub

	}

}
