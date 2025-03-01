public class Main
{
	public static void main(String[] args) 
	{
	    int a[][] = {
	                    {1,2,3},
	                    {2,5,6},
	                    {3,6,9}
	                };
	                
	   for(int i = 0; i < a[0].length; i++)
	   {
	       for(int j = 0; j < a.length; j++)
	       {
	           if(a[i][j] != a[j][i])
	           {
	               System.out.println(" Not Symmetric");
	               return;
	           }
	       }
	       
	   }
	        System.out.println("Symmetric");
	}
		
	
}
