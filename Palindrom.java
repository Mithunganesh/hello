import java.io.*;
import java.util.*;
class Palindrom{
    public static void main(String arr[]){
        Scanner ss=new Scanner(System.in);
        String s1=ss.nextLine();
        String res="";
        res=longestPalin(s1);
        System.out.println(res);
   
    }
        
        public static String longestPalin(String s) {
    if(s==null || s.length()<=1)
        return s;
 
    int ll = s.length();
    int mL = 1;
    boolean [][] dp = new boolean[ll][ll];
 
    String longpal = null;
    for(int l=0; l<s.length(); l++){
        for(int i=0; i<ll-l; i++){
            int j = i+l;
            if(s.charAt(i)==s.charAt(j) && (j-i<=2||dp[i+1][j-1])){
                dp[i][j]=true;
 
                if(j-i+1>mL){
                   mL = j-i+1; 
                   longpal = s.substring(i, j+1);
                }
            }
        }
    }
 
    return longpal;
        }
}
    


