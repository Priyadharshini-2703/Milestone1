import java.util.Scanner;

public class LogicalDay34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("the second last digit is "+secondLast(num));
		// TODO Auto-generated method stub

	}
	public static int secondLast(int num){
		int rem=0;
		for(int i=0;i<2;i++){
			if(num!=0){
				rem=num%10;
				num=num/10;
				
			}
			else if(num>=0 && num<=9){
				return -1;
			}
		}
			
	if(rem<0){
		return -rem;
	}
	else{
		return rem;
	}
	}
		
}
