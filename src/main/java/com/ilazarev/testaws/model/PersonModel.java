package com.ilazarev.testaws.model;

import com.ilazarev.testaws.validator.ValidPersonModel;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
@ValidPersonModel
public class PersonModel {

//    @NotEmpty(message = "Either Home Address or Work Address must be selected to indicate type of mailing address")
//    private String contactType;

    @NotEmpty(message = "First Name is required.")
    @Pattern(regexp = "^[A-Za-z.' ''^-]+$",
            message = ("Invalid First Name. Valid Characters(a-z,.,',^,-)."))
    @Size(max=30, message= "First Name cannot be greater than 30 characters.")
    private String firstName;

    @NotEmpty(message = "Last Name is required.")
    @Pattern(regexp = "^[A-Za-z.' ''^-]+$",
            message = ("Invalid Last name. Valid characters(a-z,.,',^,-)."))
    @Size(max = 30, message = "Last Name cannot be greater than 30 characters.")
    private String lastName;

    @Positive(message = "age should be more than zero.")
    private int age;

}
