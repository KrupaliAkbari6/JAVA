//Write a program user through input two numbers and check amicable number using Constructor.

import java.util.*;
class First
{
    First()
    {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number= ");
        int no1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int no2 = sc.nextInt();
        int sumA = 0, sumB = 0;
        for (int i = 1; i < no1; i++)
        {
            if (no1 % i == 0)
            {
               
                sumA += i;
            }
        }
        for (int i = 1; i < no2; i++)
        {
            if (no2 % i == 0)
            {
                
                sumB += i;
            }
        }
        if (sumA == no2 && sumB == no1)
        {
            System.out.println("The numbers are Amicable Number.");
        }
        else
        {
            System.out.println("The numbers are not Amicable Number");
        } 
    }
}



class Amicable
{
    public static void main(String args[])
    {
       First f=new First();
    }
}