import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class PasswordGenerator {
    public static String getNewPassword(int passwordSize) {
        String alphabet = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz?!<>-*[]{}/";
        int alphabetLength = alphabet.length();
        String password = "";
        for (int i = 0; i < passwordSize; i++) {
            int randomIndexCharInAlphabet = (int)(Math.random()*alphabetLength);
            password += alphabet.charAt(randomIndexCharInAlphabet);
        }
        return password;
    }

    public static void copyToClipboard(String str){
        Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipBoard.setContents(new StringSelection(str), null);
    }

}

