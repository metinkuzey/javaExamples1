import java.util.Scanner;
/**
 * Enter length of string input in console
 * Then enter your string words
 * Then the main program will return a string result
 * which is firstly write the odd indexes character of given string words
 * and a space character
 * and finally print the even indexes character of given string
 * **/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int givenStringLength = scan.nextInt();
        String str;
        for (int i = 0; i < givenStringLength; i++) {
            str = scan.next();
            for (int j = 0; j < str.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.print(" ");
            for (int j = 0; j < str.length(); j++) {
                if (j % 2 == 1) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
