package com.pizzariaproject.pizzaria.controller;

import com.pizzariaproject.pizzaria.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PizzariaController {
    @Autowired
    private PizzaRepository pizzaRepository;

    @GetMapping("/cardapio")
    public String cardapio(Model model) {
        model.addAttribute("pizzas", pizzaRepository.findAll());
        return "cardapio";
    }
}
