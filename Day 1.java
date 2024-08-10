Fibonacci Series

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pre=-1,cur=1,t=1;
		while(n>0){
		    cur=pre+cur;
		    System.out.print(cur+" ");
		    pre=t;
		    t=cur;
		    n-=1;
		}
	}
}
