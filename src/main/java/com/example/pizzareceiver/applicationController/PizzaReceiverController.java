package com.example.pizzareceiver.applicationController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@CrossOrigin
@SpringBootApplication
@RestController
public class PizzaReceiverController {


    private static final Logger logger = LoggerFactory.getLogger(PizzaReceiverController.class);

    @PostMapping("/pizza-receiver")
    public ResponseEntity<String> receivePizza(@RequestBody Pizza pizza) throws InterruptedException {
        // Simulate a delay (e.g., 5 seconds) 50% of the time
        if (new Random().nextBoolean()) {
//            TimeUnit.SECONDS.sleep(10);
        }
        logger.info("Received pizza:");
        logger.info(pizza.getName() + " - " + pizza.getIngredients() + " - " + pizza.getPrice() + " PLN");
        return ResponseEntity.ok("Pizza received successfully!");
    }
}
