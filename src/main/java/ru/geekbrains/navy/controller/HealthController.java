package ru.geekbrains.navy.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    // 200, 500
    @GetMapping("/health")
    public String getHealth() {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("started", true);
        return jsonObject.toString();
    }
}
