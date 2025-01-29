package Behavioral.iterator.iterators;

import Behavioral.iterator.profile.Profile;

public interface ProfileIterator {
    Profile getNext();

    boolean hasNext();

    void reset();
}
