package org.example.bootmechanics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DachiController {
    @GetMapping("/zd")
    public String helloDachi() {
        return "zdarova brad";
    }
}
