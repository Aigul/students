package ru.innopolis.university.springMVC.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.innopolis.university.springMVC.model.StudentModel;
import ru.innopolis.university.springMVC.services.StudentService;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by innopolis on 31.10.16.
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    private String redirect = "redirect:/student/list";

    @RequestMapping(value = "/list")
    public ModelAndView getAllStudents() throws SQLException {

        List<StudentModel> studentList = studentService.getAll();

        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("list", studentList);

        return modelAndView;
    }

    @RequestMapping(value = "/student={id}", method = RequestMethod.GET)
    public ModelAndView getStudent(@PathVariable long id) throws SQLException {

        StudentModel student = studentService.getStudent(id);

        ModelAndView modelAndView = new ModelAndView("student");
        modelAndView.addObject("student", student);

        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView addStudent(@ModelAttribute("student") StudentModel student) throws SQLException {
        studentService.addStudent(student);
        return new ModelAndView(redirect);
    }


}
