package Lec9;

public class Max_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int A[]= {-1,1,2,5,-7,5,9};
		
		int maxSum = Integer.MIN_VALUE;
		int i=0;
		int Start=0, End=0;
		int Sum=0;
		int m=0,n=0;
		
		
		while(i<A.length) {
		 
			if(A[i]>0) {
				   Start=i;
				   Sum=0;
				   while(i<A.length && A[i]>0) {  
			           End=i;
			           Sum = Sum + A[i];
			           i++;
			          // System.out.println(i);
		           }
		    	// System.out.println(i);
				  // System.out.println(Sum);
				   if(Sum>maxSum) {
					   m=Start;
					   n=End;
					   maxSum=Sum;
					  // System.out.println(m + " " + n + " " + maxSum);
				   }
			}
			else {
				//System.out.println(m + " " + n + " " + maxSum);
				i++;
				continue;
			}
		
		}
		for(i=m; i<=n;i++) {
			System.out.println(A[i]);
		}

	}
}