/*2. Write a Program a number is said to be Buzz Number if it ends with 7 or is
divisible by 7.
Example: 1007 is a Buzz Number.*/

import java.util.*;
class Process
{
    Scanner sc=new Scanner(System.in);
    int no;
    Process()
    {
        System.out.println("Enter the Number : ");
        no=sc.nextInt();
        if(no%10==7 || no%7==0)
        {
            System.out.println("Buzz Number");
        }
        else
        {
            System.out.println("Not a Buzz Number ");
        }
    }
}


class Buzz
{
    public static void main(String[] args) 
    {
        Process p=new Process();    
    }
}