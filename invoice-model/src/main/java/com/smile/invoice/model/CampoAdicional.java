package com.smile.invoice.model;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"value"})
@Data
public class CampoAdicional {

    @XmlValue
    private String value;
    @XmlAttribute
    private String nombre;


}