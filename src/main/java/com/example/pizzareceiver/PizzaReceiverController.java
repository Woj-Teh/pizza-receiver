package com.example.pizzareceiver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@SpringBootApplication
@RestController
public class PizzaReceiverController {
    @PostMapping("/pizza-receiver")
    public ResponseEntity<String> receivePizza(@RequestBody Pizza pizza) {
        System.out.println("Received pizza:");
        System.out.println(pizza.getName() + " - " + pizza.getIngredients() + " - " + pizza.getPrice() + " PLN");
        return ResponseEntity.ok("Pizza received successfully!");
    }
}
