package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here

        User person = new User("Kuba", "Wronski","Kuba", "lalala", LocalDate.now(),"sdads", "addfdsf");
        System.out.println("lalalal");
        person.setUsername("lala");
        System.out.println(person.getName());

    }
}
