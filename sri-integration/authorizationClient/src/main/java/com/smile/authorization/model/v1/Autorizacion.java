package com.smile.authorization.model.v1;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "estado",
        "numeroAutorizacion",
        "fechaAutorizacion",
        "ambiente",
        "comprobante"
})
@XmlRootElement(name = "autorizacion")
@Data
public class Autorizacion {

    @XmlElement(required = true)
    protected String estado;

    @XmlElement(required = true)
    protected String numeroAutorizacion;

    @XmlElement(required = true)
    protected Date fechaAutorizacion;

    @XmlElement(required = true)
    protected String ambiente;

    @XmlElement(required = true)
    protected String comprobante;

}
