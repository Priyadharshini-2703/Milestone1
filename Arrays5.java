
public class Arrays5 {

	public static void main(String[] args) {
		int arr[]={767,908,686,78,799,246,865,977,431,786};
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
		System.out.println(arr[0]+" "+arr[1]+" "+arr[arr.length-2]+" "+arr[arr.length-1]);
		// TODO Auto-generated method stub

	}

}
