
/* Task:1
         
         19.Anagram
         Examples:Listen and silent
  
*/

import java.util.Scanner;
import java.util.Arrays;
public class Anagram_19 
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(isAnagram(str1, str2))
        System.out.println("Anagram");
        else 
        System.out.println("Not an Anagram");

    }
    public static boolean isAnagram(String str1,String str2)
    {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)) return  true;
        else return false;
    }
}
