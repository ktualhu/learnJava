import java.util.Scanner;
public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Enter the palindrome: ");
        str = scanner.nextLine();
        boolean check = false;
        if(str.length() % 2 != 0) {
            for(int i = 0; i < str.length()/ 2; i++) {
                if(str.charAt(i) == str.charAt(str.length()-(i+1))) {
                    check = true;
                }
                else {
                    check = false;
                    break;
                }
            }
        }

        if(!check) {
            System.out.println("String isn't a palindrome.");
        }
        else {
            System.out.println("String is a palindrome.");
        }
    }

}
