package br.gov.sp.fatec.projetolabiv.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MainController {
    
    @GetMapping
    public String hello(){
        return "<div style='width:100%;height:100vh;justify-content:center;align-items:center;font-size:30px;display:flex; font-weight:bolder;color:blue;'>Aopa, bão fi?</div>";
    }

}
