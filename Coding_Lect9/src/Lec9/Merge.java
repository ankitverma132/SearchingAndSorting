package Lec9;
public class Merge {

	public static void main(String[] args) {
		int arr1[]= {2,6,9,15};
		int arr2[]= {1,4,6,7};
		int output[]= merge(arr1,arr2);
		
		for(int i=0;i<output.length;i++){
			
			System.out.println(output[i]);
		}
	}
	
	public static int[] merge(int arr1[], int arr2[]){
		
		int[] output = new int[arr1.length+arr2.length];
	    int i=0, j=0, k=0;     
            
          while(i<arr1.length && j<arr2.length){
        	  
                if(arr1[i]<arr2[j]){
                    output[k]=arr1[i];
                    i++;
                    k++;
                 }
                else{
                     output[k]=arr2[j];
                     j++;
                     k++;
                }
           }
          
          while(i<arr1.length)
            {               
                output[k]=arr1[i];
                i++;
                k++;
            }
          
          while(j<arr2.length)
            {               
                output[k]=arr2[j];
                j++; 
                k++;
            }   
        
      return output;
	}
}