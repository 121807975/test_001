package org.example;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    //由spring容器进行对象创建
    ApplicationContext ac;

    @Test
    public void test_01(){
        //创建容器对象，启动容器同时创建对象
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) ac.getBean("stu");
        System.out.println(student);
    }

    @Test
    public void test_02(){
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        School school = (School) ac.getBean("school");
        System.out.println(school);
    }
}
