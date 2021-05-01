package com.smile.authorization.model.v1;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "claveAccesoLoteConsultada",
        "numeroComprobantesLote"
})
@XmlRootElement(name = "respuestaLote")
@Data
public class RespuestaLote {

    @XmlElement(required = true)
    protected String claveAccesoLoteConsultada;

    @XmlElement(required = true)
    protected String numeroComprobantesLote;

}
