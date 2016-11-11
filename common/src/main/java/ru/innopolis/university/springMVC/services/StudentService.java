package ru.innopolis.university.springMVC.services;

import ru.innopolis.university.springMVC.model.StudentModel;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by innopolis on 31.10.16.
 */
public interface StudentService {
    void addStudent(StudentModel student) throws SQLException;
    void updateStudent(StudentModel student) throws SQLException;
    List<StudentModel> getAll() throws SQLException;
    StudentModel getStudent(long id) throws SQLException;
    void deleteStudent(long id) throws SQLException;
}
