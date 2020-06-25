
public class Arrays14 {

	public static void main(String[] args) {
		int matrix[][]=new int[3][3];
		int len=args.length;
		int index=0,max=0;
		if(len==9){
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					matrix[i][j]=Integer.parseInt(args[index]);
					index++;
							}
				System.out.println();
			}
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
		}
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					max=matrix[0][0];
					if(max<matrix[i][j]){
						max=matrix[i][j];
					}
				}
				
		// TODO Auto-generated method stub

	}
			System.out.println();
			System.out.println("the biggest number in the given array is "+max);

	}
		
}
}