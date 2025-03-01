import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the number: ");
	        int n=sc.nextInt();
	        int ar[]=new int[n];
	        int eve[]=new int[n];
	        int odd[]=new int[n];
	        System.out.println("Even array elements: ");
	        
	        for(int i=0;i<n;i++)
	        {
                ar[i]=sc.nextInt();
            }
   
            int j=0,k=0;
            for(int i=0;i<n;i++)
            {
                if(ar[i]%2==0){
                eve[j]=ar[i];
                j++;
            }
   
            else{
            odd[k]=ar[i];
            k++;
   }
}
    System.out.print("Even numbers array: ");
    for(int i=0; i<j; i++)
    {
        System.out.print(eve[i]);
    }
    
    System.out.print("\nOdd numbers array: ");
    for(int i=0; i<k; i++)
    {
        System.out.print(odd[i]);
    }
}
}
