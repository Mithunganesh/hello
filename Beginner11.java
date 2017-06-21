import java.util.*;
class Beginner11{
    public static void main(String arr[]){
        Scanner s=new Scanner(System.in);
       int number=s.nextInt();
       int powers=s.nextInt();
       double res=Math.pow(number,powers);
       System.out.println((int)res);
    }  
}
