package com.forestnewark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by forestnewark on 4/5/17.
 */

@Controller
public class IndexController {

    final
    StringTransmogrifierService st;

    @Autowired
    public IndexController(StringTransmogrifierService st) {
        this.st = st;
    }

    @RequestMapping("/")
    public String showIndex(Model model, String mode, String input) {
        if(mode != null && input != null){
           model.addAttribute("result",st.transmogrify(mode,input));
        }
        return "index";
    }


}
