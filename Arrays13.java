
public class Arrays13 {

	public static void main(String[] args) {
		int matrix[][]=new int[10][10];
		int len=args.length;
		int index=0;
		if(len==4){
			for(int i=0;i<2;i++){
				for(int j=0;j<2;j++){
					matrix[i][j]=Integer.parseInt(args[index]);
					index++;
							}
				System.out.println();
			}
			for(int i=0;i<2;i++){
				for(int j=0;j<2;j++){
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
		}
			System.out.println();
			for(int i=1;i>=0;i--) {
				  for(int j=1;j>=0;j--)
					{
						System.out.print(matrix[i][j]+" ");
						}
			
			System.out.println();
			}
		}

		else{
			System.out.println("please enter 4 integer");
		}
	
}
}

