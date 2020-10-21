package ru.geekbrains.navy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.navy.model.dto.PortListDTO;
import ru.geekbrains.navy.model.dto.SinglePortDTO;
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

    @GetMapping
    public ResponseEntity<PortListDTO> getPortList() {
        return ResponseEntity.ok(portService.getAllPorts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SinglePortDTO> getPort(
            @PathVariable final Long id
    ) {
        return ResponseEntity.ok(portService.getPort(id));
    }
}
