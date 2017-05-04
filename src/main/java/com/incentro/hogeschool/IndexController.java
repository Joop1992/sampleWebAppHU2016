package com.incentro.hogeschool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

<<<<<<< HEAD
    @RequestMapping("/teamalpha")
    public String teamAlpha(){ return "teamalpha";}
=======
    @RequestMapping("/empty")
    public String empty() {
        return "empty";
    }
>>>>>>> 88656096f1e93bf9f80145996c49f3447d541637
}
