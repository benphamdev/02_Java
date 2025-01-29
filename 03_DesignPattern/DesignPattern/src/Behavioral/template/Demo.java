package Behavioral.template;

import Behavioral.template.networks.Facebook;
import Behavioral.template.networks.Network;
import Behavioral.template.networks.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        System.out.println("Template Method Pattern\n");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;

        System.out.print("Input user name: ");
        String username = reader.readLine();

        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose the social network for posting message.\n" +
                                   "1 - Facebook\n" +
                                   "2 - Twitter");

        int choice = Integer.parseInt(reader.readLine());

        // Create a network based on user's choice.

        network = (choice == 1) ? new Facebook(username, password) : new Twitter(username, password);

        // Post the message.
        network.post(message);
    }
}
