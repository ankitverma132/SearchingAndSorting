package Lec9;
public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {2,5,6,9,1};
		insertionSort(arr);
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}
	}

	public static void insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) { //5 2 6 9 1---2 5 6 9 1 
			
			int temp=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=temp;
		}		
	}
}