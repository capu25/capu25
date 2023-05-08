import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Cosa desideri fare? : \n" +
                    "1) Testare la tua password \n" +
                    "2) Generare una nuova password \n");

            System.out.println("Digita la tua scelta: ");
            int scelta = sc.nextInt();
            sc.nextLine();

            switch (scelta) {

                case 1:
                    System.out.println("Inserisci di seguito la tua password: ");
                    Boolean valid;
                    String passUser = sc.nextLine();

                    if (passUser.length() < 8) {
                        valid = false;
                        System.out.println("La password DEVE essere ALMENO di 8 caratteri!");
                    } else {

                        for (int i = 0; i < passUser.length(); i++) {
                            char c = passUser.charAt(i);

                            if (('a' <= c && c <= 'z') ||
                                    ('A' <= c && c <= 'Z') ||
                                    ('0' <= c && c <= '9')) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                        }

                        if (valid = true) {
                            System.out.println("La password è SICURA!");
                        } else {
                            System.out.println("E' consigliabile cambiare password!");
                        }
                    }

                    break;

                case 2:
                    int check;
                    do {
                        System.out.println("Inserire la lunghezza della Password che si vuole generare");
                        int passwordSize = sc.nextInt();

                        String pw = PasswordGenerator.getNewPassword(passwordSize);
                        System.out.println("La nuova Password casuale e': " + pw);

                        System.out.println("Premi |1| per accettare e copiare o |2| per generare nuovamente");
                        PasswordGenerator.copyToClipboard(pw);
                        check = sc.nextInt();
                        sc.nextLine();

                        if (check == 1) {
                            System.out.println("Password copiata!");
                        }

                    } while (check == 2);
                    break;

                default:
                    System.out.println("Scelta non consentita!");
            }

        System.out.println("Grazie per aver usato AccountEssentials!");
    }
}