package Lec9;

import java.util.ArrayList;

public class PushZeroAtOneEnd {

	public static void main(String[] args) {

		int arr[]= {2,0,6,0,0,2,0,28};
		pushZerosAtEnd(arr);
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}

	}
	
//    public static void pushZerosAtEnd(int[] arr){
//		
//        ArrayList<Integer> A=new ArrayList<>();
//
//            for(int i=0;i<arr.length;i++){
//                 if(arr[i]>0){
//                  A.add(arr[i]);
//                  }
//            }
//        
//           int l=arr.length-A.size();
//           for(int i=0;i<l;i++){
//                  A.add(0);
//            }
//        
//           for(int i=0;i<arr.length;i++){
//                 arr[i]=A.get(i);
//            }       
//	}
//===============================================
	//Without using temporary Array
	 public static void pushZerosAtEnd(int[] arr){
   
		 int i=0;
		 int k=0;
		 int temp;
		 
		 while (i<arr.length) {
		 if(arr[i]>0)
		 {
			 temp=arr[i];
			 arr[i]=arr[k];
			 arr[k]=temp;
			 i++;
			 k++;
		 }
		 else if(arr[i]==0)
		 {
			 i++;	 
		 }		 
	  }
   }		 
}
 