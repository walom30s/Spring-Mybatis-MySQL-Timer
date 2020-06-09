package com.sbm.service.impl;

import com.sbm.dao.StudentMapper;
import com.sbm.entity.Student;
import com.sbm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 客户业务接口的实现类
 *
 */
@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        studentMapper.deleteById(id);

    }

    @Override
    public void insert(Student student) {
        studentMapper.insert(student);
    }
}
