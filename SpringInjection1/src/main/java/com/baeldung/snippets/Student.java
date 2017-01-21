package com.baeldung.snippets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("${student.name}")
    protected String name;

    @Autowired
    @Qualifier("Math")
    protected Course courseTaken;

    public Course getCourseTaken() {
        return courseTaken;
    }

    public void setCourseTaken(Course course) {
        this.courseTaken = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
