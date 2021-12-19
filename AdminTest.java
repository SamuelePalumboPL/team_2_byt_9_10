package com.company;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    String username = "Wrona";
    String name = "Kuba";
    String surname = "Wronski";
    String mail = "jak@gm.com";
    String nationality = "polish";
    LocalDate date = LocalDate.parse("1995-10-27", df);
    String password = "lalala";
    Admin admin = new Admin(username, name, surname, mail, date, nationality, password);

    @Test
    void TestConstructor(){
        assertEquals(admin.getUsername(), username);
        assertEquals(admin.getName(), name);
        assertEquals(admin.getSurname(), surname);
        assertEquals(admin.getEmail(), mail);
        assertEquals(admin.getNation(), nationality);
        assertEquals(admin.getDateOfBirth(), date);
        assertEquals(admin.getPassword(), password);
    }

    @Test
    void setUsername() {
        String newUsername = "Wrona2";
        admin.setUsername(newUsername);
        assertEquals(admin.getUsername(), newUsername);
    }

    @Test
    void setName(){
        String newName = "Michal";
        admin.setName(newName);
        assertEquals(admin.getName(), newName);
    }

    @Test
    void setSurname(){
        String newSurname = "Maciejewski";
        admin.setSurname(newSurname);
        assertEquals(admin.getSurname(), newSurname);
    }

    @Test
    void setEmail(){
        String newEmail = "mi@gm.com";
        admin.setEmail(newEmail);
        assertEquals(admin.getEmail(), newEmail);
    }

    @Test
    void setNationality(){
        String newNat = "German";
        admin.setNationality(newNat);
        assertEquals(admin.getNation(), newNat);
    }

    @Test
    void setDate(){
        LocalDate newDate = LocalDate.parse("1990-08-10", df);
        admin.setDateOfBirth(newDate);
        assertEquals(admin.getDateOfBirth(), newDate);
    }

    @Test
    void setPassword(){
        String newPassword = "lililili";
        admin.setPassword(newPassword);
        assertEquals(admin.getPassword(), newPassword);
    }

}