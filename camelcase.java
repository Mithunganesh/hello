import java.util.Scanner;
 
public class camelcase {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String r = "";
        char f = input.charAt(0);
        r = r + Character.toUpperCase(f);
        for (int i = 1; i < input.length(); i++) {
            char cc = input.charAt(i);
            char pc = input.charAt(i - 1);
            if (pc == ' ') {
                r = r + Character.toUpperCase(cc);
            } else {
                r = r + cc;
            }
        }
        System.out.println(r);
    }
}
