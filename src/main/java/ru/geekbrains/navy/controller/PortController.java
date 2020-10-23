package ru.geekbrains.navy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.navy.model.entity.Port;
import ru.geekbrains.navy.service.PortService;

import java.util.List;

@RestController
@RequestMapping(value = "/ports", produces = "application/json")
public class PortController {

    private PortService portService;

    @Autowired
    public PortController(PortService portService) {
        this.portService = portService;
    }

    //200, 500
    @GetMapping
    public ResponseEntity<List<Port>> getAllPorts() {
        return portService.readAllPorts();
    }

    //200, 404, 500
    @GetMapping("/{id}/capacity")
    public ResponseEntity<String> getPortCapacityInfo(
            @PathVariable(value = "id") final long id
    ) {
        return portService.readPortCapacityInfo(id);
    }
}
