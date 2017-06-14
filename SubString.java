import java.util.HashSet;
import java.util.*;
import java.io.*;
public class SubString {
    public static String subString(String input){
        HashSet<Character> set = new HashSet<Character>();
        String longestsubstr = "";
        String longestnow = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (set.contains(c)) {
                longestNow = "";
                set.clear();
            }
            longestNow += c;
            set.add(c);
            if (longestNow.length() > longestsubstr.lengt()) {
                longestsubstr = longestNow;
            }
        }
        return longestsubstr;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        System.out.println(subString(input));
    }
}
