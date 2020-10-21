package ru.geekbrains.navy.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.geekbrains.navy.model.entity.Port;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PortListDTO extends BaseDTO {

    @JsonProperty("ports")
    private List<Port> ports;

    public List<Port> getPorts() {
        return ports;
    }

    public void setPorts(List<Port> ports) {
        this.ports = ports;
    }
}
