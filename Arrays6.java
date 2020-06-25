
public class Arrays6 {

	public static void main(String[] args) {
		int arr[]={9887,5643,989,324,234,890,280,456};
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
