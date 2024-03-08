package com.driver;

public class Anchor {
    private String name;
    private String languageExpertise;
    private String type; // e.g., wedding, corporate, casual
    private int maxDuration;

    // Constructors
    public Anchor() {
        // Default constructor
    }

    public Anchor(String name, String languageExpertise, String type, int maxDuration) {
        this.name = name;
        this.languageExpertise = languageExpertise;
        this.type = type;
        this.maxDuration = maxDuration;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguageExpertise() {
        return languageExpertise;
    }

    public void setLanguageExpertise(String languageExpertise) {
        this.languageExpertise = languageExpertise;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(int maxDuration) {
        this.maxDuration = maxDuration;
    }
}