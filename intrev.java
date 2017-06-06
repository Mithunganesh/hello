import java.io.*;
import java.util.*;
class intrev{
public static void main(String ar[]){
Scanner s=new Scanner(System.in);
int inp=s.nextInt();
int rev=0;
while(inp!=0){
rev=rev*10+inp%10;
inp=inp/10;
}
System.out.print(rev);
}
}
