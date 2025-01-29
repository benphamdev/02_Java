package Behavioral.iterator.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {
    private String name;
    private String email;
    private Map<String, List<String>> contacts = new HashMap<>();

    public Profile(String email, String name, String... contacts) {
        this.name = name;
        this.email = email;

        // Parse contact list from a set of 'friend:email@gmail.com' pairs

        for (String contact : contacts) {
            String[] pairs = contact.split(":");
            String contactType = "friend", contactEmail;

            if (pairs.length == 1) {
                contactEmail = pairs[0];
            } else {
                contactType = pairs[0];
                contactEmail = pairs[1];
            }

            if (!this.contacts.containsKey(contactType)) {
                this.contacts.put(contactType, new ArrayList<>());
            }

            this.contacts.get(contactType).add(contactEmail);
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getContacts(String contactType) {
        if (!this.contacts.containsKey(contactType)) {
            this.contacts.put(contactType, new ArrayList<>());
        }
        return this.contacts.get(contactType);
    }
}
