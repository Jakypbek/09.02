package com.company;

import java.time.LocalDate;

public class Student {

        private String name;
        private String surName;
        private LocalDate birthDay;
        private String mail;

    public Student() {
    }

    public Student(String name, String surName, LocalDate birthDay, String mail) {
        this.name = name;
        this.surName = surName;
        this.birthDay = birthDay;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        if (birthDay.getYear() > LocalDate.now().getYear()) {
            System.out.println("Invalid date of birth");
        } else {
            this.birthDay = birthDay;
        }
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", birthDay=" + birthDay +
                ", mail='" + mail + '\'' +
                '}';
    }
}
