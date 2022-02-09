package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Group  {

    private Student[] students;
    private String subject;
    private LocalDate dateOfBegan;

    public Group() {
    }

    public Group(Student[] students, String subject, LocalDate dateOfBegan) {
        this.students = students;
        this.subject = subject;
        this.dateOfBegan = dateOfBegan;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDate getDateOfBegan() {
        return dateOfBegan;
    }

    public void setDateOfBegan(LocalDate dateOfBegan) {
        this.dateOfBegan = dateOfBegan;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                ", subject='" + subject + '\'' +
                ", dateOfBegan=" + dateOfBegan +
                '}';
    }
}
