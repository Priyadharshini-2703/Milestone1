
public class Arrays12 {

	public static void main(String[] args) {
		int a[]=new int[]{7,7,7};
		int b[]=new int[]{3,8,0};
		int result[]=middleWay(a,b);
		for(int i=0;i<2;i++){
			System.out.println(result[i]);
		}
	}
		public static int[] middleWay(int a[],int b[]){
		int j=0;
		int result[]=new int[2];
		for(int i=0;i<3;i++){
		if(i%2!=0){
			result[j]=a[i];
			j++;
			result[j]=b[i];
		}
		}
		return result;
		// TODO Auto-generated method stub

	}

}
