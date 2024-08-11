Power of a number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int r=1;
		while(p!=0){
		    r*=n;
		    p--;
		}
		System.out.println(r);
	}
}
