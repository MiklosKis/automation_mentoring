package com.epam.training.testautomation.collections;

import java.util.HashSet;
import java.util.Set;

public class Brainstorming {
    private final Set<String> brainstorming = new HashSet<>();

    /* Implement addIdea method to add idea to Array of Brainstorming
            if it is not already in the list, and
            if it is not null */
    public void addIdea(String ideaName) {
        if (ideaName != null) {
            brainstorming.add(ideaName); // cannot add duplicate to a Set
        }
    }

    /* Implement removeIdea method to remove idea
        if it is already existing in the array, and
        it is not null */
    public void removeIdea(String ideaName) {
        brainstorming.remove(ideaName);
    }

    // Implement getNumberOfIdeas method
    public int getNumberOfIdeas() {
        return brainstorming.size();
    }

    @Override
    public String toString() {
        if (brainstorming.size() == 0) {
            return "No ideas.";
        } else {
            return "Brainstorming{" +
                    "brainstorming=" + brainstorming +
                    '}';
        }
    }
}
