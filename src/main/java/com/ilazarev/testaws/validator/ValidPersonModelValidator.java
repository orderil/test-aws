package com.ilazarev.testaws.validator;

import com.ilazarev.testaws.model.PersonModel;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidPersonModelValidator implements ConstraintValidator<ValidPersonModel, PersonModel> {
   public void initialize(ValidPersonModel constraint) {
   }

   public boolean isValid(PersonModel obj, ConstraintValidatorContext context) {
      return true;
   }
}
