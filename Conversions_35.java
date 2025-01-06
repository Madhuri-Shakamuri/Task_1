/*Task:1 
     35.Convert decimal to hexadecimal and hexa to octal and octal to binary
 */
import java.util.Scanner;

public class Conversions_35 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal Value: ");
        int decimal=sc.nextInt();
        System.out.println("Enter a Hexadecimal Value");
        String hexa=sc.next();
        System.out.println("Enter a Octal Value");
        String octal=sc.next();

        String hexa_dec=Integer.toHexString(decimal);
        System.out.println("Decimal to Hexadecimal Value: "+hexa_dec.toUpperCase());

        int hex_dec = Integer.parseInt(hexa, 16);
        String dec_oct=Integer.toOctalString(hex_dec);
        System.out.println("Hexadecimal to Octal Value: "+dec_oct.toUpperCase());

        int oct_dec = Integer.parseInt(octal, 8);
        String dec_binary=Integer.toBinaryString(oct_dec);
        System.out.println("Octal to Binary Value: "+dec_binary);


    }
}
