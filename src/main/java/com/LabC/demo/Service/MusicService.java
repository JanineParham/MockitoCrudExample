package com.LabC.demo.Service;

import com.LabC.demo.Models.Music;

import java.util.Optional;

public interface MusicService {

    Optional<Music> getMusicByTitle(String title);
}
