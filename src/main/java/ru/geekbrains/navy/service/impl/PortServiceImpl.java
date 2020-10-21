package ru.geekbrains.navy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import ru.geekbrains.navy.dao.PortDao;
import ru.geekbrains.navy.model.dto.PortListDTO;
import ru.geekbrains.navy.model.dto.SinglePortDTO;
import ru.geekbrains.navy.model.entity.Port;
import ru.geekbrains.navy.service.PortService;

import java.util.List;

@Service
public class PortServiceImpl implements PortService {

    private PortDao portDao;

    @Autowired
    public PortServiceImpl(PortDao portDao) {
        this.portDao = portDao;
    }

    @Override
    public PortListDTO getAllPorts() {
        final PortListDTO result = new PortListDTO();
        result.setPorts(portDao.selectAllPorts());
        return result;
    }

    @Override
    public SinglePortDTO getPort(long id) {
        final SinglePortDTO result = new SinglePortDTO();
        final List<String> errors = result.getErrors();
        final Port port = getPortIfAvailable(id, errors);
        if (!errors.isEmpty()) {
            result.setPorts(port);
        }
        return result;
    }

    private Port getPortIfAvailable(long id, List<String> errors) {
        final Port port = portDao.selectPortById(id);
        if (port == null) {
            errors.add(String.format("Порт с id=%s не найден", id));
        }
        return port;
    }
}
