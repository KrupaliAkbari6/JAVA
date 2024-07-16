/*1. Write a Program Armstrong Number is a positive number if it is equal to the
sum of cubes of its digits is called Armstrong number and if its sum is not equal
to the number then it’s not a Armstrong number.
Examples: 153 is Armstrong
(1*1*1)+(5*5*5)+(3*3*3) = 153*/


class Arm
     {

    public static void main(String[] args) {

        int number = 371, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
