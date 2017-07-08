    import java.util.Scanner;
	import java.util.HashSet;
		public class arry {
		    public static String subString(String input){
		        HashSet<Character> set = new HashSet<Character>();
		        String longestsubstr = "";
		        String longestnow = "";
		        for (int i = 0; i < input.length(); i++) {
		            char c = input.charAt(i);
		            if (set.contains(c)) {
		                longestnow = "";
		                set.clear();
		            }
		            longestnow += c;
		            set.add(c);
		            if (longestnow.length() > longestsubstr.length()) {
		                longestsubstr = longestnow;
		            }
		        }
		        return longestsubstr;
		    }
		    public static void main(String[] args) {
		        Scanner s=new Scanner(System.in);
		        String input=s.nextLine();
		        System.out.println(subString(input));
		        s.close();
		    }
		}
