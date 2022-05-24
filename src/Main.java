import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello there! It's Chatbot here. How can I help you?");
        boolean running = true;
        while (running == true) {
            System.out.println(" ");
            String currentLine = input.nextLine();
            switch(currentLine) {
                case "What you can?":
                    System.out.println("Nice question. Try asking me what made me and what I eat!");
                    break;
                case "What do you eat?":
                    System.out.println("I eat only your battery and internet!");
                    break;
                case "Who made you?":
                    System.out.println("I was made thanks to Reinis!");
                    break;
                case "Bye":
                    System.out.println("Bye! Have a nice day!");
                    break;
                default:
                    System.out.println("Sorry! I am new to this and didn't understand. Try to ask me in a different way!");
                    break;
            }
        }
    }
}
