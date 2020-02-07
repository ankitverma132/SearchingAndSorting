package Lec9;

//In bubble sort compare adjecent elements until largest element reachs last position. Repeate it n-i times you will have ur sorted array.

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,6,9,1};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}
		
	}
	
	public static void bubbleSort(int[] arr)
	{
		
		for(int i=0;i<arr.length-1;i++) {
		
		for(int j=0;j<arr.length-i-1;j++)
		{
			
			int temp=0;
			if(arr[j]>arr[j+1])
			{
			   temp=arr[j];
			   arr[j]=arr[j+1];
			   arr[j+1]=temp;			
			}
			
		}	
			
	}
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
