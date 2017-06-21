import java.util.Scanner;
class Beginner10{
    public static void main(String arr[]){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int rem,count=0;
        while(x>0){
            rem=x%10;
            count++;
            x=x/10;
        }
        System.out.println(count);
       }
}
