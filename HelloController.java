package edu.ifpr.exercicio2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/exercicio")
public class HelloController {
    @GetMapping("/ola")
    @ResponseBody
    public String hello(){
        return "Olá Mundo!";
    }
}
