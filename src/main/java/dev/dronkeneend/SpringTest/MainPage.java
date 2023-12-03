package dev.dronkeneend.SpringTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {

    @GetMapping
    public String showStuff() {
        return "Dit is ff hier, zodat ik geen foutmelding krijg.";
    }

}
