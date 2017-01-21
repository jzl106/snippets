package com.baeldung.snippets;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunExamples {

    public static void runExamples(ApplicationContext context) {
        Course math = context.getBean(Math.class);
        assert (math != null);
        Student student = context.getBean(Student.class);
        assert (math == student.getCourseTaken());
        Instructor instructor = context.getBean(Instructor.class);
        assert (math != instructor.getCourseTeaching());
    }

    public static void runAnnotationBasedExamples() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        runExamples(context);
        context.close();
    }

    public static void runXMLBasedExamples() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        runExamples(context);
    }

    public static void main(String[] args) {
        runAnnotationBasedExamples();
        runXMLBasedExamples();
    }

}
