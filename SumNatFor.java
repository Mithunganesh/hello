import java.io.*;
import java.util.*;
public class SumNatFor
{
    public static void main(String args[])
    {
        int  i  ;
        int sum = 0;
        System.out.println("Enter Number of items :");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if(x>1){
        for(i=1;i<=x;i++){
            sum = sum +i;
        }
        System.out.println("Sum of "+x+" numbers is :"+sum);
        }else{
            System.out.println("Enter the Natural number...");
        }
    }
}
