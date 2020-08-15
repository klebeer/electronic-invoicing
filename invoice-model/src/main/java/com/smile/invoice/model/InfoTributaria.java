package com.smile.invoice.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoTributaria", propOrder = {"ambiente", "tipoEmision", "razonSocial", "nombreComercial", "ruc", "claveAcceso", "codDoc", "estab", "ptoEmi", "secuencial", "dirMatriz"})
@Data
public class InfoTributaria {
    @XmlElement(required = true)
    private String ambiente;
    @XmlElement(required = true)
    private String tipoEmision;
    @XmlElement(required = true)
    private String razonSocial;
    private String nombreComercial;
    @XmlElement(required = true)
    private String ruc;
    @XmlElement(required = true)
    private String claveAcceso;
    @XmlElement(required = true)
    private String codDoc;
    @XmlElement(required = true)
    private String estab;
    @XmlElement(required = true)
    private String ptoEmi;
    @XmlElement(required = true)
    private String secuencial;
    @XmlElement(required = true)
    private String dirMatriz;

}

