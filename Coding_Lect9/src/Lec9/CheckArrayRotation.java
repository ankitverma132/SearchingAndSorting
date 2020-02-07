package Lec9;

public class CheckArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {14,18,20,26,1,2,7,9,10};
		int val=checkRotation(arr);
		
		   System.out.println(val);
			
	}

	public static int checkRotation(int[] arr) {

		int min=Integer.MAX_VALUE;
		int val=0;
		
        for(int i=0; i<arr.length; i++){               
        if(arr[i]<min){                 
            min=arr[i];
            val=i;
           }
        }
		return val;		
   }
}
