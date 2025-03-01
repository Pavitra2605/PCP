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
	        
	        System.out.println("Enter array elements: ");

	        for(int i=0;i<n;i++)
	        {
                ar[i]=sc.nextInt();
            }
   
            int j=0,k=0;
            for(int i=0;i<n;i++)
            {
                if(ar[i]%2==0){
                System.out.print(ar[i]);
            }
   
   }

    for(int i=0; i<n; i++)
    {
        if(ar[i] % 2!= 0){
            System.out.print(ar[i]);
        }
    }
    
    
}
}
