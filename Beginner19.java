import java.util.*;
class Beginner19{
    public static void main(String arr[]){
        Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int res=1;
       for(int i=1;i<=n;i++){
           res=res*i;
       }
       System.out.println(res);
    }  
}
