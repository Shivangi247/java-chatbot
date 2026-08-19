import java.util.Scanner;

public class chatbox {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("You: ");
            String msg = sc.nextLine();

            if (msg.equalsIgnoreCase("hi")) {
                System.out.println("Bot: Hello!");
            }
            else if (msg.equalsIgnoreCase("how are you")) {
                System.out.println("Bot: I am fine.");
            }
            else if (msg.equalsIgnoreCase("what is your name")) {
                System.out.println("Bot: I am AI Chatbot.");
            }
            else if (msg.equalsIgnoreCase("bye")) {
                System.out.println("Bot: Goodbye!");
                break;
            }
            else {
                System.out.println("Bot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}