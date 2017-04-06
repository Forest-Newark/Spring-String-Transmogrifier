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
        else if (mode.equals("lowerCase")){
            return st.toLowerCase(input);
        }
        else if(mode.equals("vowels")){
            return st.removeVowels(input);
        }
        else if(mode.equals("reverse")){
            return st.reverse(input);
        }
        else{
            return "Nothing happened";
        }



    }




}
