public class Main
{
	public static void main(String[] args) {
		int[] arr=[2,7,11,15]
		int target=17;
		int left=0;
		int right=arr.length -1;
		int[] result= new int[]{};
		while(left < right) {
		    int sum = arr[left] + arr[right];
		    
		    if( sum== target){
		        result = new int[]{left,right};
		        break;
		    }
		    else if(sum < target){
		        left++;
		    }
		    else{
		        right --;
		    }
		}
		if(result.length == 2){
		    System.out.println("Indices :[" +result[a]+", "+result[1] + "]")
		    }
		    else{
		        System.out.println("No SOLUTION IS FOUND")
		        
		    }
		
	}
}

