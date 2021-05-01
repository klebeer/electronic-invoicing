package com.smile.authorization.model.v1;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "claveAccesoConsultada",
        "numeroComprobantes"
})
@XmlRootElement(name = "respuestaComprobante")
@Data
public class RespuestaComprobante {

    @XmlElement(required = true)
    protected String claveAccesoConsultada;

    @XmlElement(required = true)
    protected String numeroComprobantes;

}
