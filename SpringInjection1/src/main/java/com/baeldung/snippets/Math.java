package com.baeldung.snippets;

import org.springframework.stereotype.Component;

@Component("Math")
public class Math implements Course {
    protected String name;

    public Math() {
        this.name = "math";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
