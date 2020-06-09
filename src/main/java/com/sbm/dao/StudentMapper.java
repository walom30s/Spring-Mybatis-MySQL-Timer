package com.sbm.dao;

import com.sbm.entity.Student;
import org.springframework.context.annotation.ComponentScan;

/**
 * 客户的持久层接口
 * @author Joe
 */

import java.util.List;

@ComponentScan
public interface StudentMapper {

    public List<Student> findAll();
    public void deleteById(int id);
    void insert(Student student);
}
