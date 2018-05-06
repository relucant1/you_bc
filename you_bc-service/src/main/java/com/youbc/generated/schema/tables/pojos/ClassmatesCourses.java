/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClassmatesCourses implements Serializable {

    private static final long serialVersionUID = -1059731009;

    private final Integer id;
    private final String  course;

    public ClassmatesCourses(ClassmatesCourses value) {
        this.id = value.id;
        this.course = value.course;
    }

    public ClassmatesCourses(
        Integer id,
        String  course
    ) {
        this.id = id;
        this.course = course;
    }

    public Integer getId() {
        return this.id;
    }

    public String getCourse() {
        return this.course;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClassmatesCourses (");

        sb.append(id);
        sb.append(", ").append(course);

        sb.append(")");
        return sb.toString();
    }
}