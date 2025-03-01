import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int [] a= {10,20,34,3,7,67,89};
		int min= a[0];
		int temp=0;
		
		for(int i=0; i < a.length; i++){
		    for(int j= i+1; j < a.length; j++)
		    {
		        if(a[i] > a[j])
		        {
		            temp = a[i];
		            a[i]=a[j];
		            a[j]=temp;
		        }
		    }
		}
		
		System.out.println(Arrays.toString(a));
	}
}
