package ru.innopolis.university.springMVC.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.innopolis.university.springMVC.entity.Student;

import java.util.List;

/**
 * Created by innopolis on 09.11.16.
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findAll();

//    @Query("update b from Bank b where b.name = :id")
//    void updateById(@Param("id") Student student);
}
