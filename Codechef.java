/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Codechef c = new Codechef();
	    
		Scanner sc = new Scanner(System.in);
		
		int withdrawl = sc.nextInt();
		int deposit = sc.nextInt();
		
		if(withdrawl%5==0){
		    double balance = deposit - withdrawl - 0.50;
		    
		    System.out.print(String.format("%.2f",balance));
		}
	}
}
