Binary to decimal number

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int d=0,n=0;
    while(b>0){
      int t=b%10;
      d+=t*Math.pow(2,n);
      b/=10;
      n++;
    }
    System.out.print(d);
  }
}
