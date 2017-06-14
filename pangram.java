import java.io.*;
import java.util.*;
class pangram{
    public static void main(String arr[]){
        Scanner ss=new Scanner(System.in);
        String s1=ss.nextLine();
        char c[]=s1.toLowerCase().toCharArray();
        char c1[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
        int cc=0;
        for(int i=0;i<c1.length;i++){
            for(int j=0;j<c.length;j++){
                if(c1[i]==c[j]){
                    cc++;
                    break;
                }
            }
        }
        if(cc==26){
            System.out.println(s1+" is a pangram.");
        }else{
            System.out.println(s1+" is not a pangram.");
        }
        
    }
}

