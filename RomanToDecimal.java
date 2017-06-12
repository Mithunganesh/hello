import java.io.*;
import java.util.*;

    public class RomanToDecimal {
    public static void romanToDecimal(java.lang.String romanNumber) {
        int d = 0;
        int ln = 0;
        String romanNum = romanNumber.toUpperCase();
        for (int x = romanNum.length() - 1; x >= 0 ; x--) {
            char convertToDecimal = romanNum.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    d = processDecimal(1000, ln, d);
                    ln = 1000;
                    break;

                case 'D':
                    d = processDecimal(500, ln, d);
                    ln = 500;
                    break;

                case 'C':
                    d = processDecimal(100, ln, d);
                    ln = 100;
                    break;

                case 'L':
                    d = processDecimal(50, ln, d);
                    ln = 50;
                    break;

                case 'X':
                    d = processDecimal(10, ln, d);
                    ln = 10;
                    break;

                case 'V':
                    d = processDecimal(5, ln, d);
                    ln = 5;
                    break;

                case 'I':
                    d = processDecimal(1, ln, d);
                    ln = 1;
                    break;
            }
        }
        System.out.println(d);
    }

    public static int processDecimal(int d, int ln, int ld) {
        if (ln > d) {
            return ld - d;
        } else {
            return ld + d;
        }
    }

    public static void main(java.lang.String args[]) {
        Scanner s=new Scanner(System.in);
        String sss=s.nextLine();
        String ssa=sss.toUpperCase();
        romanToDecimal(ssa);
    }
}





