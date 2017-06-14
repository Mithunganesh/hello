import java.io.*;
import java.util.*;
class C_alphabet{
    public static void main(String arr[]){
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
       char k=s1.charAt(0);
        if(Character.isLetter(k)){
         System.out.println("Given Character is an Alphabet");
         }else{
         System.out.println("Given Character is not an Alphabet");
         }
      }
}
