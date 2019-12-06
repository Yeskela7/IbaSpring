package calc;

import app.controller.UserController;
import app.service.UserService;
import calc.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class CalcController {

    private CalcService calcService;
    public CalcController(@Autowired CalcService calcService){
        this.calcService=calcService;
    }

    @PostMapping("/calc")
    public String calc(@RequestParam("x") String n1, @RequestParam("y") String n2, @RequestParam("op") String op){
        return calcService.calcul(n1, n2, op);
    }

    @GetMapping("/result")
    public HashMap<Integer, String> results(){
        return calcService.results();
    }

}
