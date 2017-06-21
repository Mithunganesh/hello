import java.util.Scanner;
class Beginner111{
    public static void main(String arr[]){
        Scanner s=new Scanner(System.in);
       String user=s.nextLine();
       int k=0;
       for(int i=0;i<user.length();i++){
           k+=(int)user.charAt(i);
       }
       System.out.println(String.valueOf((char)(k/user.length())));
       }
}
