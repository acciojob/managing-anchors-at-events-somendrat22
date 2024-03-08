package com.driver;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AnchorService {
    public Anchor recommendAnchor(Event event, List<Anchor> anchors) {
        // logic to recommend anchor based on event
        for (Anchor anchor : anchors) {
            if (anchor.getType().equals(event.getEventType())
                    && anchor.getLanguageExpertise().equals(event.getLanguageRequired())
                    && anchor.getMaxDuration() >= event.getDuration()) {
                return anchor;
            }
        }
        return null; // No suitable anchor found
    }
}