package com.smile.authorization.model.v1;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "claveAccesoComprobante"
})
@XmlRootElement(name = "autorizacionComprobante")
@Data
public class AutorizacionComprobante {

    @XmlElement(required = true)
    protected String claveAccesoComprobante;

}
