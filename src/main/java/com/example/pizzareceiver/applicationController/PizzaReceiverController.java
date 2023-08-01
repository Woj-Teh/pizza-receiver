package com.example.pizzareceiver.applicationController;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
