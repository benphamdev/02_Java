package Behavioral.iterator.social_networks;

import Behavioral.iterator.iterators.FacebookIterator;
import Behavioral.iterator.iterators.ProfileIterator;
import Behavioral.iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork{
    private List<Profile> profiles;

    public Facebook(List<Profile> cache){
        if(cache != null){
            this.profiles = cache;
        }
        else{
            this.profiles = new ArrayList<>();
        }
    }

    public List<String> requestProfileFriendsFromFacebook(String profileEmail, String contactType){
        // Here would be a POST request to one of the Facebook API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...

        simulateNetworkLatency();
        System.out.println("Facebook: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        // Return a list of profile's contacts.

        Profile profile = requestProfileFromFacebook(profileEmail);

        if(profile != null){
            return profile.getContacts(contactType);
        }

        return null;
    }
    public Profile requestProfileFromFacebook(String profileEmail){
        for (Profile profile : profiles){
            if(profile.getEmail().equals(profileEmail)){
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new FacebookIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this, "coworkers", profileEmail);
    }
}
