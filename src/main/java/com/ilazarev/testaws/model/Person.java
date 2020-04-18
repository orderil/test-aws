package com.ilazarev.testaws.model;

import lombok.Data;

//@Getter
//@Setter
//@ToString(callSuper = true)
@Data
public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
}
