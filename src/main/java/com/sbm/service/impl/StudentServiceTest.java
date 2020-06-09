package com.sbm.service.impl;

import com.sbm.baseTest.SpringTestCase;
import com.sbm.service.IStudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceTest extends SpringTestCase {
    @Autowired
    private IStudentService studentService;

    @Test
    public void deleteById(){
        for (int i=60;i<80;i++){
            studentService.deleteById(i);
        }
    }
}
