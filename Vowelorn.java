import java.io.*;
import java.util.*;
class Vowelorn{
    public static void main(String arr[]){
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
       char k=s1.charAt(0);
        if((k=='a')||(k=='e')||(k=='i')||(k=='o')||(k=='u')||(k=='A')||(k=='I')||(k=='E')||(k=='O')||(k=='U')){
                System.out.println("Vowel");
            }
        else {
            System.out.println("Consonant");
        }
      }
}


