package com.smile.authorization.model.v1;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "RespuestaAutorizacionComprobante"
})
@XmlRootElement(name = "autorizacionComprobanteResponse")
@Data
public class AutorizacionComprobanteResponse {

    @XmlElement(required = true)
    protected RespuestaComprobante RespuestaAutorizacionComprobante;

}
