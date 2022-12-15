package com.springboot.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //Get Method which display JSON result
    //http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Abhijit","Raut");
    }

    //GET mathod to display result in array list JSON format
    //http://localhost:8080/studentList
    @GetMapping("/studentList")
    public List<Student> getStudents(){

        List<Student> st = new ArrayList<>();
        st.add(new Student("Abhijit", "Raut"));
        st.add(new Student("abc","def"));
        st.add(new Student("wer","pqr"));

        return st;
    }

    //REST API to handle path variable
    //http://localhost:8080/student/Abhijit/Raut

    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String fname, @PathVariable("lastName") String lname){
        return new Student(fname,lname);
    }

    //REsT API to handle query parameters
    //http://localhost:8080/student?firstname=Abhi

    @GetMapping("/student/query")
    public Student studentQueryParameter(@RequestParam(name = "firstName") String fname,
                                         @RequestParam(name="lastName") String lname){
        return new Student(fname,lname);

    }
}
