package ru.geekbrains.navy.service;

import ru.geekbrains.navy.model.dto.PortListDTO;
import ru.geekbrains.navy.model.dto.SinglePortDTO;

public interface PortService {

    PortListDTO getAllPorts();
    SinglePortDTO getPort(long id);
}
