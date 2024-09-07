package JavaPasswordGenerator;

public class Credits {
    static Animation creds = new Animation();

    public void printCredits(){
        System.out.println("\u001B[32;1m" + " ______     ______     ______     __  __     ______     ______    " + "\u001B[34;1m" + "  ______   ______     ______     ______  " + "\u001B[0m");
        System.out.println("\u001B[32;1m" + "/\\  ___\\   /\\  ___\\   /\\  ___\\   /\\ \\/\\ \\   /\\  == \\   /\\  ___\\   " + "\u001B[34;1m" + " /\\  == \\ /\\  __ \\   /\\  ___\\   /\\  ___\\ " + "\u001B[0m");
        System.out.println("\u001B[32;1m" + "\\ \\___  \\  \\ \\  __\\   \\ \\ \\____  \\ \\ \\_\\ \\  \\ \\  __<   \\ \\  __\\   " + "\u001B[34;1m" + " \\ \\  _-/ \\ \\  __ \\  \\ \\___  \\  \\ \\___  \\ " + "\u001B[0m");
        System.out.println("\u001B[32;1m" + " \\/\\_____\\  \\ \\_____\\  \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_____\\ " + "\u001B[34;1m" + "  \\ \\_\\    \\ \\_\\ \\_\\  \\/\\_____\\  \\/\\_____\\ " + "\u001B[0m");
        System.out.println("\u001B[32;1m" + "  \\/_____/   \\/_____/   \\/_____/   \\/_____/   \\/_/ /_/   \\/_____/ " + "\u001B[34;1m" + "   \\/_/     \\/_/\\/_/   \\/_____/   \\/_____/ " + "\u001B[0m");
        System.out.println("");
        creds.animateText(50 ,"\u001B[34;1m" + "Thank you for using SecurePass. " + "\u001B[32;1m" + "GoodBye!" + "\u001B[0m");
        System.out.println("\n");
        creds.animateText(80,"\u001B[1m" + "Created by:\n");
        creds.animateText(50, "\u001B[35m" + "Tinte, Vaughn Gabrielle" + "\u001B[0m");
    }
}
