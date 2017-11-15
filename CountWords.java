import java.util.Scanner;
public class CountWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        str = scanner.nextLine();
        str.toLowerCase();
        int wordsCount = 0;
        boolean isWord = false;
        for(int i = 0; i <= str.length()-1; i++) {
            if(Character.isLetter(str.charAt(i)) && i != str.length()-1) {
                isWord = true;
            }
            else if(!Character.isLetter(str.charAt(i)) && isWord) {
                isWord = false;
                wordsCount++;
            }
            else if(Character.isLetter(str.charAt(i)) && isWord && i == str.length() - 1) {
                wordsCount++;
            }
        }

        System.out.println(" " + wordsCount);
    }

}
