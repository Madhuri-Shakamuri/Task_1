/* Task:1
         
        24.Count sum vowels and consonants,digits and spaces
  
*/
import java.util.Scanner;

public class Count_24 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        int vowels=0,cons=0,digits=0,spaces=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
            vowels++;
            }
            else if(ch>='a' && ch<='z')
            {
                cons++;
            }
            else if(Character.isDigit(ch))
            {
                digits++;
            }
            else if(ch==' ')
            {
                spaces++;
            }
            
        }
        System.out.println("vowels: "+vowels+"\nConsonants: "+cons+"\nDigits: "+digits+"\nSpaces: "+spaces);

    }
}
