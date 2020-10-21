package ru.geekbrains.navy.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.geekbrains.navy.model.entity.Port;
import ru.geekbrains.navy.model.entity.Ship;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SingleShipDTO extends BaseDTO {

    @JsonProperty("ship")
    private Ship ship;

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
