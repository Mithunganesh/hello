import java.io.*;
import java.util.*;
class Rot{
    public static void main(String arr[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        s.nextLine();
        int diff=n-k;
        int a[]=new int[n];
        int b[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        
        System.arraycopy(a, k+1, b, 0, diff-1);
        System.arraycopy(a, 0, b, diff-1, k+1);
        for(int i=0;i<n;i++){
            System.out.print(b[i]);
        }
    }
}



