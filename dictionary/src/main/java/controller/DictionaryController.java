package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Locale;

@Controller
public class DictionaryController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/change")
    public String convert(Model model, @RequestParam String eng) {
        String result = null;
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("cat", "Meo meo");
        dictionary.put("dog", "Gau gau");
        dictionary.put("chicken", "Cuc tac");
        dictionary.put("cig", "Ec Ec");
        for (String key : dictionary.keySet()){
            if (eng.toLowerCase(Locale.ROOT).equals(key)) {result = dictionary.get(key); break;}
        }
        if (result == null){ result = "Khong co ket qua";}
        model.addAttribute("result", result);
        return "index";
    }
}
