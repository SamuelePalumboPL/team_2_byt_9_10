package com.company;

import java.time.LocalDate;

public abstract class Person {

    private String name;
    private String surname;
    private String email;
    private LocalDate dateofBirth;
    private String nationality;
    private String password;

    public Person(String name, String surname, String email, LocalDate dateOfBirth, String nationality, String password)
    {
        this.setName(name);
        this.setSurname(surname);
        this.setEmail(email);
        this.setDateOfBirth(dateOfBirth);
        this.setNationality(nationality);
        this.setPassword(password);
    }

    public Person(String name, String surname, String email, LocalDate dateOfBirth, String password)
    {
        this(name,surname,email,dateOfBirth,null,password);
    }

    public void setName(String name)
    {
        this.name = new String(name);
    }

    public String getName()
    {
        return this.name;
    }

    public void setSurname(String surname)
    {
        this.surname = new String(surname);
    }

    public String getSurname()
    {
        return this.surname;
    }

    public void setEmail(String email)
    {
        this.email = new String(email);
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setDateOfBirth(LocalDate date)
    {
        this.dateofBirth = date;
    }

    public LocalDate getDateOfBirth()
    {
        return this.dateofBirth;
    }

    public void setNationality(String nation)
    {
        this.nationality = nation;
    }

    public String getNation()
    {
        return this.nationality;
    }

    public void setPassword(String password)
    {
        this.password = new String(password);
    }

    public String getPassword()
    {
        return this.password;
    }

    public static int logIn(String username, String password)
    {
        // ask to database if there is an entry with this username
        // if not throw exception

        // ask to database if the password is correct
        // if not throw exception

        // logged
        return 0;
    }

    public static int forgetPassword()
    {
        // ask to user the email

        // ask to database if there is an entry with this email
        // if not throw exception

        // send email with recovery code

        // ask for code to the user

        // check if the code is correct
        // if not throw exception

        // show change password screen

        // update password

        return 0;
    }

    public int verify()
    {
        // send email with verification link

        // wait for confirm

        return 0;
    }

    public void viewGame(String title)
    {
        // search for the game "title"
    }


}
