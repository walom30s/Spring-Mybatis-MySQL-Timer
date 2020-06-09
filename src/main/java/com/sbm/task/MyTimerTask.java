package com.sbm.task;

import com.sbm.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class MyTimerTask {

    @Scheduled(cron = "0/5 * * * * ?")
    private void configureTasks() {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService studentService= (IStudentService) ac.getBean("studentService");
        for (int i=40;i<60;i++){
            studentService.deleteById(i);
        }
    }
}

