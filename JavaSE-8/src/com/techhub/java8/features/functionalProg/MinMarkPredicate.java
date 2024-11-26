package com.techhub.java8.features.functionalProg;

import java.util.function.Predicate;

public class MinMarkPredicate implements Predicate<Student> {

    private final Integer marks;

    public MinMarkPredicate(Integer marks) {
        this.marks = marks;
    }

    @Override
    public boolean test(Student studnet) {
        return studnet.getMarks() >= this.marks;
    }
}