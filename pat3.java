package ecm11;
import java.util.Scanner;

public class pat3 
{
	public static void main(String []args)
	{
		Scanner scn=new Scanner(System.in);
	    System.out.println(" enter the size");
	    int a=scn.nextInt();
	    int l=1;
	    int s=a/2;
	    
	    for (int i=1;i<=a; i++)
	    {
	    	for (int j=1;j<=s;j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	
	    	for (int j=1;j<=l;j++)
	    	{
	    		System.out.print("X");
	    	}
	    
			
	    System.out.println();
	    if (i<=a/2) {
	    s--;
	    l++;
	   
	    }else {
	    	s++;
	    	l--;
	    }
	    
	    }
	}
}

