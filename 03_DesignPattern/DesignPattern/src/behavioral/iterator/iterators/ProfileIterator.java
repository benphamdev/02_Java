package behavioral.iterator.iterators;

import behavioral.iterator.profile.Profile;

public interface ProfileIterator {
    Profile getNext();

    boolean hasNext();

    void reset();
}
