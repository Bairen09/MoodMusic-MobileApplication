package com.example.moodMusic.controller;

import com.example.moodMusic.model.Song;
import com.example.moodMusic.repository.SongRepository;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/songs")
public class SongController {

    private final SongRepository repo;

    public SongController(SongRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/{mood}")
    public List<Song> getSongs(@PathVariable String mood) {
        return repo.findByMoodIgnoreCase(mood);
    }
}