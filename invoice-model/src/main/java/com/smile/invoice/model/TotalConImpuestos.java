package com.smile.invoice.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"totalImpuesto"})
@Data
public class TotalConImpuestos {
    @XmlElement(required = true)
    private List<TotalImpuesto> totalImpuesto = new ArrayList<>();


}