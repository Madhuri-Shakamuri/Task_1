/*Task:1 
        36.Find Profit and loss.
*/
import java.util.Scanner;

public class Profit_loss_36 
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Cost Price: ");
        int cp=sc.nextInt();
        System.out.println("Enter Selling Price: ");
        int sp=sc.nextInt();
        int profit=0,loss=0;
        if(sp>cp)
        {
            profit=sp-cp;
            System.out.println("Profit: "+profit);

        }
        else if(cp>sp)
        {
            loss=cp-sp;
            System.out.println("Loss: "+loss);
        }
        else 
        {
            System.out.println("No profit/loss ");
        }

    } 
}
