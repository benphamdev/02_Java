package behavioral.iterator.social_networks;

import behavioral.iterator.iterators.LinkedInIterator;
import behavioral.iterator.iterators.ProfileIterator;
import behavioral.iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class LinkedIn implements SocialNetwork {
    private List<Profile> contacts;

    public LinkedIn(List<Profile> contacts) {
        if (contacts == null) {
            contacts = new ArrayList<>();
        } else {
            this.contacts = contacts;
        }
    }

    private Profile findProfile(String profileEmail) {
        for (Profile profile : contacts) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Profile requestProfileFromLinkedIn(String profileEmail) {
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading profile '" + profileEmail + "' over the network...");

        return findProfile(profileEmail);
    }

    public List<String> requestProfileFriendsFromLinkedIn(String profileEmail, String contactType) {
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        Profile profile = findProfile(profileEmail);

        if (profile != null) {
            return profile.getContacts(contactType);
        }

        return null;
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedInIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this, "coworkers", profileEmail);
    }
}
