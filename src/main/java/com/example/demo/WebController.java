package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    // Mappa la Home Page
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Mappa Chi Sono
    @GetMapping("/chi-sono")
    public String chiSono() {
        return "HTML/chisono"; 
    }

    // Mappa Esperienze
    @GetMapping("/esperienze")
    public String esperienze() {
        return "HTML/esperienze";
    }

    // Mappa Progetti
    @GetMapping("/progetti")
    public String progetti() {
        return "HTML/progetti";
    }

    // Mappa Certificati
    @GetMapping("/certificati")
    public String certificati() {
        return "HTML/certificati";
    }

    // Mappa Contattami
    @GetMapping("/contattami")
    public String contattami() {
        return "HTML/contattami";
    }
}