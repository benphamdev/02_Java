package Behavioral.iterator.spammer;

import Behavioral.iterator.iterators.ProfileIterator;
import Behavioral.iterator.profile.Profile;
import Behavioral.iterator.social_networks.SocialNetwork;

public class SocialSpammer {
    public SocialNetwork socialNetwork;
    public ProfileIterator iterator;

    public SocialSpammer(SocialNetwork socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    public void sendSpamToFriends(String profileEmail, String message) {
        System.out.println("\nIterating over friends...\n");
        iterator = socialNetwork.createFriendsIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendSpamToCoworkers(String profileEmail, String message) {
        System.out.println("\nIterating over coworkers...\n");
        iterator = socialNetwork.createCoworkersIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendMessage(String email, String message) {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }
}
