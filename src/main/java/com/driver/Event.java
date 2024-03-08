package com.driver;

public class Event {
    private String eventType; // e.g., wedding, corporate, casual
    private String languageRequired;
    private int duration;

    // Constructor
    public Event(String eventType, String languageRequired, int duration) {
        this.eventType = eventType;
        this.languageRequired = languageRequired;
        this.duration = duration;
    }

    // Getters and Setters
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getLanguageRequired() {
        return languageRequired;
    }

    public void setLanguageRequired(String languageRequired) {
        this.languageRequired = languageRequired;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}