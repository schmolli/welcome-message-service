package de.hhz.bpm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessageController {
	
	private static final String template = "Hello %s %s %s!";

    @RequestMapping("/welcome")
    public WelcomeMessage greeting(@RequestParam(value="first", defaultValue="Beautiful") String first, 
    		@RequestParam(value="last", defaultValue="World") String last,
    		@RequestParam(value="gender", defaultValue="w") String gender) {
    	String salut = gender.equals("m")?"Mr.":"Mrs.";
        return new WelcomeMessage(String.format(template, salut, first, last),gender, first, last);
    }

}
