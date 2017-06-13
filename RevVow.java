import java.io.*;
import java.util.*;
class RevVow{
    public static void main(String arr[]){
       Scanner s=new Scanner(System.in);
       String s1=s.nextLine();
       String s2="";
       StringBuffer sb=new StringBuffer(s1);
       sb.reverse();
       s2=sb.toString();
       String s3="";
       s3=s2.replaceAll("[aeiouAEIOU]","");
       System.out.println(s3);
         }
       }
        
        
       


