import java.util.*;
class Beginner14{
    public static void main(String arr[]){
        Scanner s=new Scanner(System.in);
       int start=s.nextInt();
       int end=s.nextInt();
       for(int i=start;i<=end;i++){
           if(i%2!=0){
            System.out.println(i);   
           }
       }
    }  
}
