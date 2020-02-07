//Given an array of positive integers. Your task is to find the leaders in the array.
//Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader. 
//Example:
//Input:
//3
//6
//16 17 4 3 5 2
//5
//1 2 3 4 0
//5
//7 4 5 7 3
//Output:
//17 5 2
//4 0
//7 7 3
package Lec9;
public class Leaders {

	public static void main(String[] args) {

		int[] A = {3, 12, 34, 2, 0, -1};
		 
		 for(int i=0; i<A.length-1; i++){
		     
		     boolean flag=true;
		     for(int j=i+1; j<A.length; j++){
		         
		         if(A[i]<A[j]){
		            flag=false; 
		         }
		     }
		         if(flag==true){
		             System.out.print(A[i] + " ");		         
		     }
		 }
		 System.out.print(A[A.length-1]);
	}

}
