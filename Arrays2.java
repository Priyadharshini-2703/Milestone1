
public class Arrays2 {

	public static void main(String[] args) {
		int arr[]={10,7,3,8,5};
		int temp,max=arr[0];

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
		
			}
			
		}
				System.out.println(arr[arr.length-1]+" "+arr[0]);

	}

}
