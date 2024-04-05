package id.co.indocyber.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("controller-route")
public class SimpleController {

    @GetMapping("index")
    public String index(){
        return "controller-route/index";
    }
}
