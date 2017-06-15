import java.io.*;
import java.util.*;
public class Natural 
{
    public static void main(String args[])
    {
        int x, i = 1 ;
        int sum = 0;
        System.out.println("Enter Number of items :");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        if(x<1){
        while(i <= x)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+x+" numbers is :"+sum);
        }else{
            System.out.println("Enter the Natural number...");
        }
    } 
}
