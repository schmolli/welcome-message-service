package de.hhz.bpm;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessageController {
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/welcome")
    public WelcomeMessage greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new WelcomeMessage(counter.incrementAndGet(), String.format(template, name));
    }

}
