package com.smile.authorization.model.v1;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "claveAccesoLote"
})
@XmlRootElement(name = "autorizacionComprobanteLote")
@Data
public class AutorizacionComprobanteLote {

    @XmlElement(required = true)
    protected String claveAccesoLote;

}
