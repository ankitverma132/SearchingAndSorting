package Lec9;

public class PushZeroAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,0,6,9,1,0,0,28};
		pushZeroAtEnd(arr);
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}

	}

	public static void pushZeroAtEnd(int[] arr) {
		 for(int i=0;i<arr.length-1;i++) {
				
			    for(int j=0;j<arr.length-1;j++)
			       {
				
			        	int temp=0;
				        if(arr[j]<arr[j+1])
				          {
				             temp=arr[j];
				             arr[j]=arr[j+1];
				             arr[j+1]=temp;			
				}
				
			}
	    }
		
	}

}
