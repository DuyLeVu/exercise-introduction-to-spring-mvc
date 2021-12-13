package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/change")
    public String convert(Model model, @RequestParam double vnd) {
        model.addAttribute("result", (vnd * 23000));
        return "index";
    }
}
