HCF of two numbers

import java.util.*;
class Main
{
  public static void main (String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int num1 = sc.nextInt(), num2 = sc.nextInt(), hcf;

    while (num1 != num2)
    {
        if (num1 > num2)
            num1 -= num2;
        else
            num2 -= num1;
    }


    System.out.println("The HCF: "+ num1);
  }
}
