import java.io.*;
import java.util.*;
public class Prefix {
	public static void main(String arr[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=s.nextInt();
		s.nextLine();
		String a[]=new String[n];
		System.out.println("Enter the String elements to array:");
		for(int i=0;i<n;i++){
			a[i]=s.next();
		}
		s.close();
		String result=longestCommonPrefix(a);
		
		System.out.println(result);
		
	}
	public static String longestCommonPrefix(String[] strs) {
	    String longestPrefix = "";
	    if(strs.length>0){
	        longestPrefix = strs[0];
	    }
	    for(int i=1; i<strs.length; i++){
	        String analyzing = strs[i];
	        int j=0;
	        for(; j<Math.min(longestPrefix.length(), strs[i].length()); j++){
	            if(longestPrefix.charAt(j) != analyzing.charAt(j)){
	            	System.out.println("No common prefix");
	                break;
	            }
	        }
	        longestPrefix = strs[i].substring(0, j);
	    }
	    return longestPrefix;
	}
}
