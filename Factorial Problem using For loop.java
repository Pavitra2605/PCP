import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		int n ,i, fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		
		for(i=1; i<=n; i++)
		{
		    fact= fact*i;
		}
		System.out.println(fact);
		sc.close();
	}
}

