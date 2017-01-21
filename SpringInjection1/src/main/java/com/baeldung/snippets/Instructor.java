package com.baeldung.snippets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instructor {
    protected String name;
    protected Course courseTeaching;

    @Autowired
    public Instructor(@Value("${instructor.name}") String name, @Qualifier("Math") Course course) {
        this.courseTeaching = course;
    }

    public Course getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(Course courseTeaching) {
        this.courseTeaching = courseTeaching;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
