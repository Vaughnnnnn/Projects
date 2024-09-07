package JavaPasswordGenerator;

import java.util.Scanner;

public class PasswordGenerator {
    private static final Scanner scan = new Scanner(System.in);
    static Generator generator = new Generator();
    static History passwordHistory = new History();
    static Credits creds = new Credits();
    static Animation creator = new Animation();
    static passwords Egg = new passwords();

    public static void main(String[] args) {
        System.out.println("\u001B[32;1m" + " ______     ______     ______     __  __     ______     ______    " + "\u001B[34;1m" + "  ______   ______     ______     ______  " + "\u001B[0m");
        System.out.println("\u001B[32;1m" + "/\\  ___\\   /\\  ___\\   /\\  ___\\   /\\ \\/\\ \\   /\\  == \\   /\\  ___\\   " + "\u001B[34;1m" + " /\\  == \\ /\\  __ \\   /\\  ___\\   /\\  ___\\ " + "\u001B[0m");
        System.out.println("\u001B[32;1m" + "\\ \\___  \\  \\ \\  __\\   \\ \\ \\____  \\ \\ \\_\\ \\  \\ \\  __<   \\ \\  __\\   " + "\u001B[34;1m" + " \\ \\  _-/ \\ \\  __ \\  \\ \\___  \\  \\ \\___  \\ " + "\u001B[0m");
        System.out.println("\u001B[32;1m" + " \\/\\_____\\  \\ \\_____\\  \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_____\\ " + "\u001B[34;1m" + "  \\ \\_\\    \\ \\_\\ \\_\\  \\/\\_____\\  \\/\\_____\\ " + "\u001B[0m");
        System.out.println("\u001B[32;1m" + "  \\/_____/   \\/_____/   \\/_____/   \\/_____/   \\/_/ /_/   \\/_____/ " + "\u001B[34;1m" + "   \\/_/     \\/_/\\/_/   \\/_____/   \\/_____/ " + "\u001B[0m");

        System.out.print("\n                                        ");
        creator.animateText(50,"\u001B[1m" + "Created By: Tinte, Vaughn Gabrielle" + "\u001B[0m");
        System.out.println("\u001B[1m");
        System.out.println("\n              SecurePass: Lock It Up, Keep It Safe! Create Strong, Random Passwords, Customize\n" +  
                           "                              Lengths, and Safeguard Your Accounts with Ease.                 \n" +
                           "                   Your Personal Info, Fortified and Protected for Complete Peace of Mind.");
        System.out.print("\u001B[0m");


        while (true) {
            System.out.print("\n");
            System.out.println("\u001B[36;1m" + "+----------------------------+" + "\u001B[0m");
            System.out.println("\u001B[36;1m" + "+ " + "\u001B[0m" + "\u001B[1m" + "Welcome to SecurePass      " + "\u001B[0m" + "\u001B[36;1m" + "+" + "\u001B[0m");
            System.out.println("\u001B[36;1m" + "+----------------------------+" + "\u001B[0m");
            System.out.println("\u001B[36;1m" + "+" + "\u001B[0m" + "\u001B[1m" + " What would you like to do  " + "\u001B[0m" + "\u001B[36;1m" + "+" + "\u001B[0m");
            System.out.println("\u001B[36;1m" + "+" + "\u001B[0m" + "\u001B[1m" + "  1. Generate Password      " + "\u001B[0m" + "\u001B[36;1m" + "+" + "\u001B[0m");
            System.out.println("\u001B[36;1m" + "+" + "\u001B[0m" + "\u001B[1m" + "  2. Check Password History " + "\u001B[0m" + "\u001B[36;1m" + "+" + "\u001B[0m");
            System.out.println("\u001B[36;1m" + "+" + "\u001B[0m" + "\u001B[1m" + "  3. Exit                   " + "\u001B[0m" + "\u001B[36;1m" + "+" + "\u001B[0m");
            System.out.println("\u001B[36;1m" + "+----------------------------+" + "\u001B[0m");
            System.out.print("\u001B[1m" + "Enter your choice: " + "\u001B[0m");
            int choice = scan.nextInt();

            switch (choice) {
                case 1: 
                    generator.printGenerator();
                    break;

                case 2: 
                    passwordHistory.printHistory();
                    break;

                case 3:
                    creds.printCredits();
                    System.exit(choice);
                    break;

                case 69:
                    Egg.printEgg();
                    break;

                default: 
                    System.out.println("\u001B[41m" + "\nInvalid Option. Please try again." + "\u001B[0m");
            }
        }
    }
}