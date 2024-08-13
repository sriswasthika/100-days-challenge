Perfect square

import java.util.*;
public class Main {

	static boolean isPerfectSquare(int x)
	{
		if (x >= 0) {
		
			int sr = (int)Math.sqrt(x);
		
			return ((sr * sr) == x);
		}
		return false;
	}

	public static void main(String[] args)
	{
    Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();

		if (isPerfectSquare(x))
			System.out.print("True");
		else
			System.out.print("False");
	}
}
