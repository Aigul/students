package ru.innopolis.university.springMVC.model;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by innopolis on 10.11.16.
 */
public class StudentModel implements Serializable {

    private long id;

    private String lastName;

    private String name;

    private String sex;

    private Date dateBirth;

    public StudentModel(String lastName, String name, String sex, Date dateBirth) {
        this.lastName = lastName;
        this.name = name;
        this.sex = sex;
        this.dateBirth = dateBirth;
    }

    public StudentModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return "Student {" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}
