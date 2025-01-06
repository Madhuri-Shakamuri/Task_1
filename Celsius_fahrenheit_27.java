/*Task:1 
     17.A program that converts temperatures from Celsius to Fahrenheit and vice versa.
 */

import java.util.Scanner;

public class Celsius_fahrenheit_27 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenhiet: ");
        int f=sc.nextInt();
        System.out.println("Temperature in Celsius: "+(f-32)*5/9);
        System.out.println("Enter the temperature in Celsius: ");
        int c=sc.nextInt();
        System.out.println("Temperature in Fahrenhiet: "+((c*9/5)+32));

   }
   
}
