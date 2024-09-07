package JavaPasswordGenerator;

import java.util.List;

public class Animation {

    public void animation(int seconds) {
        try {
            Thread.sleep(seconds);
        }
        catch (InterruptedException v) {
            v.printStackTrace();
        }
    }

    public void animatePassword(String password){
        System.out.println("\u001B[32;1m");
        System.out.print("Generating Password");
        for (int i = 0; i < 10; i++){
            System.out.print(".");
            animation(200);
        }
        System.out.println("\u001B[0m");

        System.out.print("\u001B[32;1m" + "\nGenerated Password: ");
        for (int i = 0; i < password.length(); i++){
            System.out.print("\u001B[42;1m" + password.charAt(i));
            animation(100);
        }
        System.out.println("\u001B[0m");
    }
    
    public void animateHistory(List<String> passwordHistory){
        System.out.println("\u001B[36m");
        System.out.print("Cheking Password History");
        for (int i = 0; i < 5; i++){
            System.out.print(".");
            animation(300);
        }
        System.out.println("");
        
        if (passwordHistory.isEmpty()){
            System.out.println("");
            System.out.println("\u001B[41m" + "No Password Detected." + "\u001B[0m");
        } else {
            System.out.println("\u001B[36m");
            System.out.println(" ---- ---------------------- ");
            System.out.println("| #  | PASSWORD HISTORY     |");
            System.out.println(" ---- ---------------------- ");

            int count = 1;
            for (String password : passwordHistory) {
                System.out.printf("| %-2d | \u001B[32m %-17s \u001B[0m \u001B[36m |", count++, password);
                System.out.println("");
            }
            System.out.println(" ---- ---------------------- ");
            System.out.print("\u001B[0m");
        }
    }

    public void animateText(int animation, String text){
        for(int i = 0; i < text.length(); i++){
            animation(animation);
            System.out.print(text.charAt(i));
        }
    }
}