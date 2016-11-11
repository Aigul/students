package ru.innopolis.university.springMVC.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by innopolis on 31.10.16.
 * Сущность Студент
 */
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "name")
    private String name;

    @Column(name = "sex", length = 125)
    private String sex;

    @Column(name = "date")
    private Date dateBirth;

    public Student(String lastName, String name, String sex, Date dateBirth) {
        this.lastName = lastName;
        this.name = name;
        this.sex = sex;
        this.dateBirth = dateBirth;
    }

    public Student() {
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
