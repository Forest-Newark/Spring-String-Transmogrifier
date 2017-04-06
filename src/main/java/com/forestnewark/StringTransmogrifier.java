package com.forestnewark;

import org.springframework.stereotype.Component;

/**
 * Created by forestnewark on 4/5/17.
 */
@Component
public class StringTransmogrifier {

    public String toUpperCase(String string) {

        return string.toUpperCase();
    }

    public String toLowerCase(String string) {

        return string.toLowerCase();
    }

    public String removeVowels(String string) {

        String output = "";
        for (int x = 0;x < string.length();x++) {
            if(!string.substring(x,x+1).matches("[aeiouAIOU]")) {
                output = output + string.substring(x,x+1);
            }
        }
       return output;
    }


    public String reverse(String input) {

        String reverse = "";
        for(int x = input.length(); x > 0 ; x--) {
            reverse = reverse + input.substring(x-1,x);
        }
        return reverse;
    }
}
