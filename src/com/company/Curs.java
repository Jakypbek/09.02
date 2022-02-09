package com.company;

import java.util.Arrays;

public class Curs {

    private String nameOfCurs;
    private int number;
    private String nameOfTeacher;
    private Group[] groups;

    public Curs() {
    }

    public Curs(String nameOfCurs, int number, String nameOfTeacher, Group[] groups) {
        this.nameOfCurs = nameOfCurs;
        this.number = number;
        this.nameOfTeacher = nameOfTeacher;
        this.groups = groups;
    }

    public String getNameOfCurs() {
        return nameOfCurs;
    }

    public void setNameOfCurs(String nameOfCurs) {
        this.nameOfCurs = nameOfCurs;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Curs{" +
                "nameOfCurs='" + nameOfCurs + '\'' +
                ", number=" + number +
                ", nameOfTeacher='" + nameOfTeacher + '\'' +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
