package com.sbm.service;

import com.sbm.dao.StudentMapper;
import com.sbm.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 客户的业务层接口
 *
 */

import java.util.List;


public interface IStudentService {
     List<Student> findAll();
    void deleteById(Integer id);
    void insert(Student student);

}
