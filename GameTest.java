package com.company;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    String name = "gra";
    int date = 1990;
    String info = "info";
    int Score = 5;
    String type = "RTS";

    Game game = new Game(name, date, info, Score, type);


    @Test
    void TestConstructor(){
        assertEquals(game.getName(), name);
        assertEquals(game.getPublishYear(), date);
        assertEquals(game.getInfo(), info);
        assertEquals(game.getScore(), Score);
        assertEquals(game.getType(), type);
    }


    @Test
    void setName(){
        String newName = "game2";
        game.setName(newName);
        assertEquals(game.getName(), newName);
    }

    @Test
    void setPublishYear() {
        int newYear = 1995;
        game.setPublishYear(newYear);
        assertEquals(game.getPublishYear(), newYear);
    }

    @Test
    void setInfo() {
        String newInfo = "info2";
        game.setInfo(newInfo);
        assertEquals(game.getInfo(), newInfo);
    }

    @Test
    void setScore() {
        int newScore = 4;
        game.setScore(newScore);
        assertEquals(game.getScore(), newScore);
    }

    @Test
    void setType() {
        String newType = "FPS";
        game.setType(newType);
        assertEquals(game.getType(), newType);
    }
}