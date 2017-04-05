package com.forestnewark;

import org.springframework.stereotype.Component;

/**
 * Created by forestnewark on 4/5/17.
 */
@Component
public class StringTransmogrifierService {

private StringTransmogrifier st;

    public StringTransmogrifierService(StringTransmogrifier st) {
        this.st = st;
    }

    public String transmogrify(String mode, String input) {
        if (mode.equals("upperCase")){
            return st.toUpperCase(input);
        }


        return "Nothing happened";
    }




}
