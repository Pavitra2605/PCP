import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int [] a= {10,20,34,3,7,67,89};
	    int temp;
	    for(int i=0,j= a.length-1; i < j; i++, j--)
	    {
	        temp= a[i];
	        a[i]=a[j];
	        a[j] = temp;
	    }
	    
	    System.out.print(Arrays.toString(a));
	    
	
	}
}
