package com.smile.invoice.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"codigoPrincipal", "codigoAuxiliar", "descripcion", "cantidad", "precioUnitario", "precioSinSubsidio", "descuento", "precioTotalSinImpuesto", "detallesAdicionales", "impuestos"})
@Data
public class Detail {

    @XmlElement(required = true)
    private String codigoPrincipal;
    private String codigoAuxiliar;
    @XmlElement(required = true)
    private String descripcion;
    @XmlElement(required = true)
    private BigDecimal cantidad;
    @XmlElement(required = true)
    private BigDecimal precioUnitario;
    @XmlElement(required = true)
    private BigDecimal precioSinSubsidio;
    @XmlElement(required = true)
    private BigDecimal descuento;
    @XmlElement(required = true)
    private BigDecimal precioTotalSinImpuesto;
    private DetallesAdicionales detallesAdicionales;

    @XmlElement(required = true)
    private Impuestos impuestos;


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"impuesto"})
    @Data
    public static class Impuestos {
        @XmlElement(required = true)
        private List<Impuesto> impuesto = new ArrayList<>();

    }
}
