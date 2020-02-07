package Lec9;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,0,6,10,20,7,6,28};
		rotate(arr,2);
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}

	}
	
	public static void rotate(int[] arr, int d) {
		

        for(int i=0; i<d; i++){
            
          int temp=arr[0];
           
              for(int j=0; j<arr.length-1; j++){
                  arr[j]=arr[j+1];   
                 }
             arr[arr.length-1]=temp;
           
       }
            
	}

}
