package controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting() {
        return "index";
    }

    @GetMapping("/edit")
        public String showEditForm(Model model){
            model.addAttribute("name","long cho");
            return "edit";
    }

    @GetMapping("/tong")
    public String showEditForm(Model model, @RequestParam int a, int b){
//        int result = a + b;
        model.addAttribute("result",(a + b));
        return "tong";
    }
}


