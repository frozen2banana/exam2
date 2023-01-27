package com.exam2.PizzaShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam2.PizzaShop.models.Order;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

    @Controller
    @RequestMapping ("/pizza")
    public class PizzaController {


    // I keep getting this error, have tried for hours !!! (spent all my time stuck here !!!)
    // The validation errors are not appearing, I have no idea why !!! (STUCK FOREVER!!!)


     
        @PostMapping (
            consumes = "application/x-www-form-urlencoded",
            produces = "text/html")
        public String saveOrder (@Valid @ModelAttribute ("order") Order order, BindingResult result, 
                    Model model, HttpServletResponse response){
            if(result.hasErrors()) {
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST); // error code 400
                return "contact";
        }
        return "index";
    }
}

