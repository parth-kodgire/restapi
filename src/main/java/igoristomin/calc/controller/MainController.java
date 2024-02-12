package igoristomin.calc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.text.DecimalFormat;

@RestController
public class MainController {

    // Example: http://localhost:8080/?op=add&num=1&num2=0.0015
    @GetMapping("/")
    public String showIndex(@RequestParam String op, @RequestParam double num, @RequestParam double num2) {
        double result;

        // Output format
        DecimalFormat df = new DecimalFormat("0.###");

        switch(op) {
            // Add
            case "add":
                result = num + num2;
                return df.format(result);
            // Subtract
            case "sub":
                result = num - num2;
                return df.format(result);
            // Multiply
            case "mult":
                result = num * num2;
                return df.format(result);
            // Divide
            case "div":
                result = num / num2;
                return df.format(result);
        }

        return "Input error";
    }

}
