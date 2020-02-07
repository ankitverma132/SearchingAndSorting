package Lec9;
public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {9,9,9,5,2};
		int arr2[]= {5,3};
		int output[]= sumOfTwoArrays(arr1,arr2);
		
		for(int i=0;i<output.length;i++){
			
			System.out.println(output[i]);
		}

	}
	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
		int m;	
		if(arr1.length>arr2.length)
			m=arr1.length;
		else
			m=arr2.length;
		
        int[] output= new int[m+1];
		       
        int n=output.length-1;  //3
        int i=arr1.length-1;    //2
        int j=arr2.length-1;    //1
        int carry=0;
        
        while(i>=0 && j>=0){
            
               output[n]=(carry+arr1[i]+arr2[j])%10;
               carry=(carry+arr1[i]+arr2[j])/10;
               i--;
               j--;
               n--;
                          
         }
        while(i>=0){
        output[n]=(carry+arr1[i])%10;
        carry=(carry+arr1[i])/10;
            i--;
            n--;
        }
        
        while(j>=0){
        output[n]=(carry+arr2[j])%10;
        carry=(carry+arr2[j])/10;
            j--;
            n--;
        }
        output[n]=carry;
		return output;  
            
	}
}
