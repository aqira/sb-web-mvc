package id.co.indocyber.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/controller-route")
public class SimpleController {

    @GetMapping("index")
    public String index(@RequestParam(required = false) String search){
        System.out.println("search result: " + search);
        return "controller-route/index";
    }

    @GetMapping("details")
    public String redirectDetails(@RequestParam(required = true) Integer id){
        return "redirect:/controller-route/details/" + id;
    }

    @GetMapping("details/{id}")
    public String details(@PathVariable Integer id){
        System.out.println(id);
        return "controller-route/details";
    }

    @PostMapping("submit-form")
    public String submitForm(){
        System.out.println("berhasil post!");
        return "redirect:/controller-route/index";
    }
}
