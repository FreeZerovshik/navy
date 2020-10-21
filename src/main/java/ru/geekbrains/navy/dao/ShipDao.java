package ru.geekbrains.navy.dao;

import ru.geekbrains.navy.model.entity.Ship;
import ru.geekbrains.navy.model.enums.ShipStatusType;

import java.util.List;

public interface ShipDao {

    List<Ship> selectAllShips();
    Ship selectShipById(long id);
    void insertShip(Ship ship);
    void updateShipStatusById(long id, ShipStatusType status);
    void updateShipPortById(long id, long portId);
    void deleteShipById(long id);
}
