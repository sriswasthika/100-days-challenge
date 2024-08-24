Perfect Number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int s=0,i=1;
	while(i<=n){
	    if(n%i==0){
	        s+=i;
	        i++;
	    }
	}
	if(n==s){
	    System.out.println("Perfect no");
	}
	else{
	    System.out.println("No");
	}
	}
}
