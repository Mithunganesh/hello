import java.util.Scanner;
class Beginner12{
    public static void main(String arr[]){
        Scanner s=new Scanner(System.in);
       String s1=s.nextLine();
       String s2="";
       StringBuffer sb=new StringBuffer(s1);
       s2+=sb.reverse().toString();
       if(s1.equalsIgnoreCase(s2)){
       System.out.println("palindrome..");}
       else{System.out.println("Not a palindrome..");}
    }  
}
