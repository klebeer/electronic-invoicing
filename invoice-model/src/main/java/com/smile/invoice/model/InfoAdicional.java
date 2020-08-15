package com.smile.invoice.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"campoAdicional"})
@Data
public class InfoAdicional {

    @XmlElement(required = true)
    private List<CampoAdicional> campoAdicional = new ArrayList<>();


}