package com.example.moodMusic.model;

import jakarta.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String url;
    private String mood;

    public Song() {}

    public Song(String name, String url, String mood) {
        this.name = name;
        this.url = url;
        this.mood = mood;
    }

    public String getName() { return name; }
    public String getUrl() { return url; }
    public String getMood() { return mood; }
}
