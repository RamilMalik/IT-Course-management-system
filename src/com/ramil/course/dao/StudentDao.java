
package com.ramil.course.dao;

import com.ramil.course.model.Student;
import java.util.List;


    
    public interface StudentDao{
        boolean registerNewStudent(Student student);
        List<Student> getAllStudent();
    }
    

