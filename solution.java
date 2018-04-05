import java.util.*;
 class Solution
 {
	public static void mian(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n<0)
			System.out.println("Negative");
		else if(n==0)
			System.out.println("Zero");
		else if(n>0)
			System.out.println("Positive");
	}
 }
