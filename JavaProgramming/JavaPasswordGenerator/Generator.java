package JavaPasswordGenerator;

import java.util.Random;
import java.util.Scanner;


public class Generator {
    private static Scanner scan = new Scanner(System.in);
    History storePass = new History();
    Animation animate = new Animation();
    String password;

    private static final String UpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LowerCase = "abcdefghijklmnopqrstuvwxyz";
    private static final String Numbers = "0123456789";
    private static final String Special = "~`!@#$%^&*()_+-=[]{}<>?,.;':";

    private static final String combinedChars = UpperCase + LowerCase + Numbers + Special;

    public String generator(int length) {
        String Valid = combinedChars;
        Random random = new Random();
        StringBuilder passBuilder = new StringBuilder(length);
    
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(Valid.length());
            passBuilder.append(Valid.charAt(randomIndex));
        }
        return passBuilder.toString();
    }

    public void printGenerator() {
        while(true) {
        System.out.print("\u001B[1m" + "\nEnter Password Length (8-16): " + "\u001B[0m");
        int passwordLength = scan.nextInt();
        password = generator(passwordLength);
            if (passwordLength == 0){
                break;
            }
            else if (passwordLength < 8){
                System.out.println("\u001B[41;1m" + "\nInvalid! Length is too short." + "\u001B[0m");
            }
            else if(passwordLength > 16){
                System.out.println("\u001B[41;1m" + "\nInvalid! Length is too long." + "\u001B[0m");
            }
            else {
                animate.animatePassword(password);
                storePass.addPassword(password);
                break;
            }
        }
    }
}