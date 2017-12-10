package com.alcoholest.Alcoholcount;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping(path="/")
    public String homepage(){
        return "start";
    }




    @PostMapping
    public double destiny (int typ){
        double klasse=0;
        switch(typ){
            case 1:
                klasse= 0.55;
                break;
            case 2:
                klasse= 0.55;
                break;
            case 3:
                klasse= 0.68;
                break;
        }
        return klasse;

    }
    public double umrechner(double personen_masse){
        personen_masse=personen_masse/1000;
        return personen_masse;
    }

    public double DerRechner(double klasse,double personen_masse,double alc){
        double alcoholgehat=personen_masse*klasse/alc;
        return alcoholgehat;

    }
}
