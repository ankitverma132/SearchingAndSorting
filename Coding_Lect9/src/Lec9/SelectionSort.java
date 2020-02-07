package Lec9;

//In selection sort take first element as min and there index as min_index and then search for smallest element in remaining array
//and then swap first element with that smallest element so after first iteration you will have smallest element at first place.
//repeate this process n-1 times you will have sorted array

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {2,5,6,9,1};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}

	}	
	public static void  selectionSort(int[] arr){
		
		for(int i=0; i<arr.length-1; i++){
			int min= arr[i];
			int min_index=i;			
			
			for(int j=i+1; j<arr.length;j++){
				if(arr[j]<min)
				{
				  	min=arr[j];
				  	min_index=j;
				}								
			}	
			
	      if(min_index!= i)
	      {
	    	  
	    	arr[min_index]=arr[i];
	    	arr[i]=min;	    				    	  
	      }
			
		}		
	}
}