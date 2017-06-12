import java.io.*;
import java.util.*;
class ConverInt{
    public static void main(String arr[]){
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int a;
        try{
            a=Integer.parseInt(s1);
            System.out.println("Converted to integer:"+a);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}

