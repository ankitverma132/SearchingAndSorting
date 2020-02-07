package Lec9;
public class SecondLargest {

	public static void main(String[] args) {

		int arr[]= {2,0,6,10,20,7,28,28};
		
		int Sec_Max=secondLargestElement(arr);		
			System.out.println(Sec_Max);
	
	}
//	public static int secondLargestElement(int[] arr) {       
//		   
//        int max=Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){               
//          if(arr[i]>max){                 
//              max=arr[i];                        
//            }
//        }
//       
//       for(int i=0; i<arr.length; i++){               
//          if(arr[i]==max){                 
//              arr[i]=-1;                        
//            }
//        }
//    
//        max=Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){               
//          if(arr[i]>max){                 
//              max=arr[i];                        
//            }
//        }   
//    return max;
//   }
//======================================================
	//Using only one scan
	public static int secondLargestElement(int[] arr) {       
		   
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){               
          if(arr[i]>max){
        	  max2=max;
              max=arr[i];                        
            }
        }      
    return max2;
   }
}