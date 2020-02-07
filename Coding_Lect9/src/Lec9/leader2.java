package Lec9;
public class leader2 {

	public static void main(String[] args) {

		int[] input = {7, 4, 5, 7, 3};
		  int size = input.length;
	        for (int i = 0; i < size; i++)  
	        { 
	            int j; 
	            for (j = i + 1; j < size; j++)  
	            { 
	                if (input[i] <= input[j]) 
	                    break; 
	            } 
	            if (j == size) // the loop didn't break 
	                System.out.print(input[i] + " "); 
	        } 
	}

}
