package com.LabC.demo.Service;

import com.LabC.demo.Models.Music;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MusicServiceImpl implements MusicService{

    List<Music> musicList = new ArrayList<>();

    @Override
    public Optional<Music> getMusicByTitle(String title) {
        return musicList.stream()
                .filter(music -> music.getTitle().equals(title))
                .findFirst();

    }
}
