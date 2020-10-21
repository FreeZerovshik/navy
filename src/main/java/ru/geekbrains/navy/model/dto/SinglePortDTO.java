package ru.geekbrains.navy.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.geekbrains.navy.model.entity.Port;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SinglePortDTO extends BaseDTO {

    @JsonProperty("port")
    private Port ports;

    public Port getPorts() {
        return ports;
    }

    public void setPorts(Port ports) {
        this.ports = ports;
    }
}
