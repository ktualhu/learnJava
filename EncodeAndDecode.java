import java.util.Scanner;

public class EncodeAndDecode {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String msg = in.nextLine();
        String encmsg = "";
        String decmsg = "";
        int key = 67;
        int secKey = 88;

        System.out.print("Basic message: ");
        System.out.println(msg);

        for(int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char)(~msg.charAt(i));
            //encmsg = encmsg + (char)(msg.charAt(i) ^ key);
        }

        System.out.print("EncodeAndDecode message: ");
        System.out.println(encmsg);

        for(int i = 0; i < encmsg.length(); i++) {
            decmsg = decmsg + (char) (~encmsg.charAt(i));
            //decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        }

        System.out.print("Decode message: ");
        System.out.println(decmsg);
    }

}
