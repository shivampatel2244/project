import java.util.*;
import java.lang.*;

class oddevenString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        System.out.print("Enter String :");
        str = s.nextLine();
        char[] odd = new char[20];
        char[] even = new char[20];
        for (int i = 0, j = 0; i < str.length(); i++, j++) {
            if (i % 2 == 0) {
                odd[i] = str.charAt(i);
            }
            if (i % 2 != 0) {
                even[j] = str.charAt(i);
            }
        }
        System.out.print(even);
        System.out.print(odd);
    }
}