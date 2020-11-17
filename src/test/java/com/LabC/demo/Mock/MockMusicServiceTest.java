package com.LabC.demo.Mock;

import com.LabC.demo.Models.Music;
import com.LabC.demo.Service.MusicService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockMusicServiceTest {

    Optional<Music> music;

    @Mock
    MusicService musicService;

    @BeforeEach
    public void setUp(){
        music = Optional.of( new Music("Rock", false, "Bohemian Rhapsody"));
    }

    @Test
    public void test(){
        when(musicService.getMusicByTitle("Bohemian Rhapsody"))
                .thenReturn(music);
        String expected = "Bohemian Rhapsody";
        String actual = musicService.getMusicByTitle("Bohemian Rhapsody").get().getTitle();
        assertEquals(expected, actual);
    }
}
