package com.ilazarev.testaws.controller;

import com.ilazarev.testaws.model.PersonModel;
import com.ilazarev.testaws.util.ApplicationConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
public class PersonFormController {

    @PostMapping(value = "/personForm")
    public String custom(
            Model model,
            @ModelAttribute(ApplicationConstants.PERSON_FORM_MODEL) @Valid PersonModel personModel,
            BindingResult bindingResult,
            HttpServletRequest request,
            HttpServletResponse httpResponse
    ) {
        // todo implement
        return "person";
    }

}
