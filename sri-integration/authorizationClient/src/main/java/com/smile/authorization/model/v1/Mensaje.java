package com.smile.authorization.model.v1;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "identificador",
        "mensaje",
        "informacionAdicional",
        "tipo"
})
@XmlRootElement(name = "mensaje")
@Data
public class Mensaje {

    @XmlElement(required = true)
    protected String identificador;

    @XmlElement(required = true)
    protected String mensaje;

    @XmlElement(required = true)
    protected String informacionAdicional;

    @XmlElement(required = true)
    protected String tipo;

}
