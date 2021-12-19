package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    String username = "Wrona";
    String name = "Kuba";
    String surname = "Wronski";
    String mail = "jak@gm.com";
    String nationality = "polish";
    LocalDate date = LocalDate.parse("1995-10-27", df);
    String password = "lalala";
    User user = new User(username, name, surname, mail, date, nationality, password);

    @Test
    void TestConstructor(){
        assertEquals(user.getUsername(), username);
        assertEquals(user.getName(), name);
        assertEquals(user.getSurname(), surname);
        assertEquals(user.getEmail(), mail);
        assertEquals(user.getNation(), nationality);
        assertEquals(user.getDateOfBirth(), date);
        assertEquals(user.getPassword(), password);
    }


    @Test
    void setUsername() {
        String newUsername = "Wrona2";
        user.setUsername(newUsername);
        assertEquals(user.getUsername(), newUsername);
    }

    @Test
    void setName(){
        String newName = "Michal";
        user.setName(newName);
        assertEquals(user.getName(), newName);
    }

    @Test
    void setSurname(){
        String newSurname = "Maciejewski";
        user.setSurname(newSurname);
        assertEquals(user.getSurname(), newSurname);
    }

    @Test
    void setEmail(){
        String newEmail = "mi@gm.com";
        user.setEmail(newEmail);
        assertEquals(user.getEmail(), newEmail);
    }

    @Test
    void setNationality(){
        String newNat = "German";
        user.setNationality(newNat);
        assertEquals(user.getNation(), newNat);
    }

    @Test
    void setDate(){
        LocalDate newDate = LocalDate.parse("1990-08-10", df);
        user.setDateOfBirth(newDate);
        assertEquals(user.getDateOfBirth(), newDate);
    }

    @Test
    void setPassword(){
        String newPassword = "lililili";
        user.setPassword(newPassword);
        assertEquals(user.getPassword(), newPassword);
    }




}