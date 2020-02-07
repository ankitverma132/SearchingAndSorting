package Lec9;
public class Sort012 {

	public static void main(String[] args) {
		int arr[]= {0,2,1,2,0};
		sort012(arr);
		
		for(int i=0;i<arr.length;i++){			
			System.out.println(arr[i]);
		}

	}
//	public static void sort012(int[] arr){
//        int Z=0, One=0, T=0;
//        for(int i=0; i<arr.length; i++){         
//            if(arr[i]==0){
//                Z++;
//            }
//            else if(arr[i]==1){
//                One++;
//            }
//            else
//                T++;
//        }
//        int j=0; 
//        for(int i=0; i<Z; i++){          
//            arr[j]=0;
//            j++;
//            }
//        for(int i=0; i<One; i++){          
//            arr[j]=1;
//            j++;
//            }
//        for(int i=0; i<T; i++){          
//            arr[j]=2;
//            j++;
//            } 
//     }
	public static void sort012(int[] arr){
		
		int i=0,nZ=0,nT=arr.length-1,temp=0;
		while(i<arr.length-1)
		if(arr[i]==1) {
			i++;
		}
		else if(arr[i]==0) {
			temp=arr[i];
			arr[i]=arr[nZ];
			arr[nZ]=temp;
			i++;
			nZ++;
			
		}
		else if(arr[i]==2 && nZ<nT) {
			temp=arr[i];
			arr[i]=arr[nT];
			arr[nT]=temp;			
			nT--;		
		}
		else {
			i++;
		}
	}		
 }