package behavioral.iterator.iterators;

import behavioral.iterator.profile.Profile;
import behavioral.iterator.social_networks.LinkedIn;

import java.util.ArrayList;
import java.util.List;

public class LinkedInIterator implements ProfileIterator {
    private LinkedIn linkedIn;
    private String type;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public LinkedInIterator(LinkedIn linkedIn, String type, String email) {
        this.linkedIn = linkedIn;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> profiles = linkedIn.requestProfileFriendsFromLinkedIn(email, type);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) return null;

        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);

        if (friendProfile == null) {
            friendProfile = linkedIn.requestProfileFromLinkedIn(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;

        return friendProfile;
    }

    @Override
    public boolean hasNext() {
        lazyLoad();

        return currentPosition < emails.size();
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
