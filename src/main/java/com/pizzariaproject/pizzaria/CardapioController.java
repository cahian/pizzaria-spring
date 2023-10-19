package com.pizzariaproject.pizzaria;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CardapioController {
    @GetMapping("/cardapio")
    public String cardapio(Model model) {
        // model.addAttribute("name", name);
        return "cardapio";
    }
}
