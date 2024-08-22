Harshad Number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int s=0;
		while(n!=0){
		   s+=n%10;
		   n/=10;
		}
		if(m%s==0){
		    System.out.println("Harshad number");
		}
		else{
		    System.out.println("No");
		}
	}
}
