package ru.geekbrains.navy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.navy.model.entity.Ship;
import ru.geekbrains.navy.model.entity.ShipStatus;
import ru.geekbrains.navy.service.ShipService;

import java.util.List;

@RestController
@RequestMapping(value = "/ships", produces = "application/json")
public class ShipController {

    private ShipService shipService;

    @Autowired
    public ShipController(ShipService shipService) {
        this.shipService = shipService;
    }

    //200, 400, 500
    @GetMapping
    public ResponseEntity<List<Ship>> getAllShips(
            @RequestParam(value = "status", required = false) final String status
    ) {
        return shipService.readAllShips(status);
    }

    //200, 400, 404, 422, 500
    @PostMapping
    public ResponseEntity<String> postShip(
            @RequestBody final Ship ship
    ) {
        return shipService.createShip(ship);
    }

    //200, 404, 500
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteShip(
            @PathVariable(value = "id") final long id
    ) {
        return shipService.deleteShip(id);
    }

    //200, 404, 500
    @GetMapping("/{id}/status")
    public ResponseEntity<ShipStatus> getShipStatus(
            @PathVariable(value = "id") final long id
    ) {
        return shipService.readShipStatus(id);
    }

    //200, 400, 404, 422, 500
    @PutMapping("/{id}/status")
    public ResponseEntity<ShipStatus> putShipStatus(
            @PathVariable(value = "id") final long id,
            @RequestParam(value = "port_id", required = false) final Long portId,
            @RequestBody final ShipStatus status
    ) {
        return shipService.updateShipStatus(id, portId, status);
    }
}
