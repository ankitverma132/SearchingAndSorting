package Lec9;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "this is test";
		String str = "";
        int i=0;
        int j=0;
        int minlen = Integer.MAX_VALUE;
        int index =0;
        int index2 = 0;
        
        while(i<=input.length()){
            
            if(i<input.length() && input.charAt(i)!=' '){
                i++;                
            }
            
            else if(i==input.length() && input.charAt(i)==' '){
                
                if((i-j) < minlen){
                    minlen = i-j;
                    index = j;
                    index2 = i;
                }
                i++;
                j=i;                
            }
  
        }
         str = input.substring(index,index2);
         System.out.println(str);
	}

}
