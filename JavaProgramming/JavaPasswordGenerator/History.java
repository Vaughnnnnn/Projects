package JavaPasswordGenerator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class History {
    public static List<String> passwordHistory = new ArrayList<>();
    static Animation animate = new Animation();
    String password;
    
    public void addPassword(String password){
        passwordHistory.add(password);
        saveHistoryToFile(password);
    }

    public void printHistory() {
        animate.animateHistory(passwordHistory);
    }

    public void saveHistoryToFile(String password) {
        try {
            FileWriter writer = new FileWriter("PasswordHistory.txt" , true);
            BufferedWriter write = new BufferedWriter(writer);
                write.write("Date and Time generated: " + new java.util.Date() + ", " + "Password Generated: " + password + "\n");
                write.close();
        } catch (Exception e) {
            System.err.println("Error occurred while saving password history to file" + e.getMessage());
        }
    }
}