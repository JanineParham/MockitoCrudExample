package com.LabC.demo;

import com.LabC.demo.Models.Music;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {

    Music music;

    @BeforeEach
    public void setUp(){
        music = new Music();
    }

    @Test
    public void testDefaultConstructor(){
        assertAll("name",
                () -> assertNotNull(music),
                () -> assertEquals(null, music.getTitle()),
                () -> assertEquals(null, music.getGenre()),
                () -> assertEquals(false, music.isExplicit()));
    }
}
