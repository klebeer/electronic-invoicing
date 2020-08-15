package com.smile.invoice.model;


import lombok.Data;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"infoTributaria", "infoFactura", "detalles", "infoAdicional"})
@XmlRootElement(name = "factura")
@Data
public class Factura {

    @XmlElement(required = true)
    private InfoTributaria infoTributaria;
    @XmlElement(required = true)
    private InfoFactura infoFactura;
    @XmlElement(required = true)
    private Detalles detalles;
    private InfoAdicional infoAdicional;
    @XmlAttribute
    private String id;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    private String version;

}
