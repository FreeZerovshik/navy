package ru.geekbrains.navy.service;

import ru.geekbrains.navy.model.dto.ShipListDTO;
import ru.geekbrains.navy.model.dto.SingleShipDTO;
import ru.geekbrains.navy.model.dto.VoidDTO;
import ru.geekbrains.navy.model.entity.Ship;

public interface ShipService {

    ShipListDTO getAllShips();
    SingleShipDTO getShip(long id);
    VoidDTO updateShip(Ship ship);
    VoidDTO deleteShip(long id);
    VoidDTO createShip(Ship ship);
}
