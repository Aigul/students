package ru.innopolis.university.springMVC.services.impl;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.innopolis.university.springMVC.entity.Student;
import ru.innopolis.university.springMVC.model.StudentModel;
import ru.innopolis.university.springMVC.repository.StudentRepository;
import ru.innopolis.university.springMVC.services.StudentService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by innopolis on 10.11.16.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    private MapperFacade mapperFacade = new DefaultMapperFactory.Builder().build().getMapperFacade();

    @Override
    public void addStudent(StudentModel student) throws SQLException {
        studentRepository.save(mapperFacade.map(student, Student.class));
    }

    @Override
    public void updateStudent(StudentModel student) throws SQLException {

    }

    @Override
    public List<StudentModel> getAll() throws SQLException {
        List<StudentModel> list = new ArrayList<>();
        mapperFacade.mapAsCollection(studentRepository.findAll(), list, StudentModel.class);
        return list;
    }

    @Override
    public StudentModel getStudent(long id) throws SQLException {
        Student student = studentRepository.findOne(id);
        return mapperFacade.map(student, StudentModel.class);
    }

    @Override
    public void deleteStudent(long id) throws SQLException {
        studentRepository.delete(id);
    }
}
