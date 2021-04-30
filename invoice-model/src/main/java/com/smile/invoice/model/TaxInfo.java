package com.smile.invoice.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoTributaria", propOrder = {"stage", "tipoEmision", "razonSocial", "nombreComercial", "ruc", "claveAcceso", "codDoc", "estab", "ptoEmi", "secuencial", "dirMatriz"})
@Data
public class TaxInfo {

    @XmlElement(required = true, name = "ambiente")
    private String stage;
    @XmlElement(required = true, name = "tipoEmision")
    private String tipoEmision;
    @XmlElement(required = true, name = "razonSocial")
    private String razonSocial;
    @XmlElement(required = true, name = "nombreComercial")
    private String nombreComercial;
    @XmlElement(required = true, name = "ruc")
    private String ruc;
    @XmlElement(required = true, name = "claveAcceso")
    private String claveAcceso;
    @XmlElement(required = true, name = "codDoc")
    private String codDoc;
    @XmlElement(required = true, name = "estab")
    private String estab;
    @XmlElement(required = true, name = "ptoEmi")
    private String ptoEmi;
    @XmlElement(required = true, name = "secuencial")
    private String secuencial;
    @XmlElement(required = true, name = "dirMatriz")
    private String dirMatriz;


    public static final class Builder {
        private TaxInfo taxInfo;

        private Builder() {
            taxInfo = new TaxInfo();
        }

        public static Builder newTaxInfo() {
            return new Builder();
        }

        public Builder withAmbiente(String ambiente) {
            taxInfo.setStage(ambiente);
            return this;
        }

        public Builder withTipoEmision(String tipoEmision) {
            taxInfo.setTipoEmision(tipoEmision);
            return this;
        }

        public Builder withRazonSocial(String razonSocial) {
            taxInfo.setRazonSocial(razonSocial);
            return this;
        }

        public Builder withNombreComercial(String nombreComercial) {
            taxInfo.setNombreComercial(nombreComercial);
            return this;
        }

        public Builder withRuc(String ruc) {
            taxInfo.setRuc(ruc);
            return this;
        }

        public Builder withClaveAcceso(String claveAcceso) {
            taxInfo.setClaveAcceso(claveAcceso);
            return this;
        }

        public Builder withCodDoc(String codDoc) {
            taxInfo.setCodDoc(codDoc);
            return this;
        }

        public Builder withEstab(String estab) {
            taxInfo.setEstab(estab);
            return this;
        }

        public Builder withPtoEmi(String ptoEmi) {
            taxInfo.setPtoEmi(ptoEmi);
            return this;
        }

        public Builder withSecuencial(String secuencial) {
            taxInfo.setSecuencial(secuencial);
            return this;
        }

        public Builder withSecuencial(long secuencial) {
            taxInfo.setSecuencial(String.format("%09d", new Object[]{Long.valueOf(secuencial)}));
            return this;
        }

        public Builder withDirMatriz(String dirMatriz) {
            taxInfo.setDirMatriz(dirMatriz);
            return this;
        }

        public TaxInfo build() {
            return taxInfo;
        }
    }


}

