import java.util.Scanner;
public class Trash {
    public static void main(String args[]) {
        Scanner h = new Scanner(System.in);
        System.out.print("First string: ");
        String str1 = h.nextLine();
        System.out.println("String length:" + str1.length());
        System.out.println("First half: " + str1.substring(0, (str1.length() - 1) / 2));
        System.out.println("Second half: " + str1.substring((str1.length() - 1) / 2, str1.length()));
        System.out.print("Second string: ");
        String str2 = h.nextLine();
        if (str2.equals(str1)) {
            System.out.println("These 2 strings are the same.");
        }
        if (str2.length() > str1.length()) {
            System.out.println(str2 + " is longer");
        } else {
            System.out.println(str1 + " is longer");
        }
        if (str2.compareTo(str1) > 0) {
            System.out.println(str2 + " comes after " + str1 + " alphabetically");
        } else if (str2.compareTo(str1) < 0) {
            System.out.println(str1 + " comes before " + str2 + " alphabetically");
        } else {
            System.out.println(str1 + " is the same as " + str2 + " alphabetically");
        }
        if (str1.indexOf(str2) > -1) {
            System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        } else {
            System.out.println(str2 + " is not found in " + str1);
        }
    }
}