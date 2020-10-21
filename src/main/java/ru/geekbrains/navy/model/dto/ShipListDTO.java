package ru.geekbrains.navy.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.geekbrains.navy.model.entity.Port;
import ru.geekbrains.navy.model.entity.Ship;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShipListDTO extends BaseDTO {

    @JsonProperty("ships")
    private List<Ship> ships;

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }
}
