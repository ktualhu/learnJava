import java.util.Scanner;
public class CountVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Enter the string: ");
        str = scanner.nextLine();
        str.toLowerCase();
        int vowelCounter = 0;

        for(int i = 0; i <= str.length()-1; i++) {
            switch (str.charAt(i)) {
                case 'a' :
                    vowelCounter++;
                    break;
                case 'e' :
                    vowelCounter++;
                    break;
                case 'u' :
                    vowelCounter++;
                    break;
                case 'y' :
                    vowelCounter++;
                    break;
                case 'i' :
                    vowelCounter++;
                    break;
                case 'o' :
                    vowelCounter++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("The vowels count is " + vowelCounter);
    }

}
