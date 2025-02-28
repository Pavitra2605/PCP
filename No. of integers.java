import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the no of elements:");
		Scanner sc= new Scanner(System.in); lij
		int n= sc.nextInt();
		int a[]= new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
		    System.out.println("Enter the no"+(i+1)+":");
		    a[i]=sc.nextInt();
		    if(a[i]>40 && a[i]<100)
		        sum+=a[i];
		}
		System.out.println("Array elements are:");
		for(int i=0;i<n;i++)
		{
		    System.out.println(a[i]);
		}
		
		System.out.println("sum of array is:"+sum);
	}
}

