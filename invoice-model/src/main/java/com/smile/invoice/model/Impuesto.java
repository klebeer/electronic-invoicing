package com.smile.invoice.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impuesto", propOrder = {"codigo", "codigoPorcentaje", "tarifa", "baseImponible", "valor"})
@Data
public class Impuesto {
    @XmlElement(required = true)
    private String codigo;
    @XmlElement(required = true)
    private String codigoPorcentaje;
    @XmlElement(required = true)
    private BigDecimal tarifa;
    @XmlElement(required = true)
    private BigDecimal baseImponible;
    @XmlElement(required = true)
    private BigDecimal valor;
}

