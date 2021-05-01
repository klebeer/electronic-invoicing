package com.smile.authorization.model.v1;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "RespuestaAutorizacionLote"
})
@XmlRootElement(name = "autorizacionComprobanteLoteResponse")
@Data
public class AutorizacionComprobanteLoteResponse {

    @XmlElement(required = true)
    protected RespuestaLote RespuestaAutorizacionLote;

}
