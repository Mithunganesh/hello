import java.util.Scanner;
class Beginner06{
    public static void main(String arr[]){
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
       if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
        System.out.println("leap year");}else{
            System.out.println("Not a leap year");
        }
       }
}
