package ma.ac.emi.ginfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class Controlleur {

    @GetMapping(value = "/coco")
    public String coucou1(){
        return "Hello";
    }
    @PostMapping(value = "/coco")
    public String coucou2(){
        return "Bonjour";
    }
}
