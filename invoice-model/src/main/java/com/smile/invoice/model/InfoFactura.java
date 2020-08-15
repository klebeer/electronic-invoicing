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
@XmlType(name = "", propOrder = {"fechaEmision", "dirEstablecimiento", "contribuyenteEspecial", "obligadoContabilidad", "tipoIdentificacionComprador", "guiaRemision", "razonSocialComprador", "identificacionComprador", "direccionComprador", "totalSinImpuestos", "totalSubsidio", "totalDescuento", "totalConImpuestos", "compensaciones", "propina", "importeTotal", "moneda", "pagos"})
@Data
public class InfoFactura {

    @XmlElement(required = true)
    private String fechaEmision;
    @XmlElement(required = true)
    private String dirEstablecimiento;
    private String contribuyenteEspecial;
    private String obligadoContabilidad;
    @XmlElement(required = true)
    private String tipoIdentificacionComprador;
    private String guiaRemision;
    @XmlElement(required = true)
    private String razonSocialComprador;
    @XmlElement(required = true)
    private String identificacionComprador;
    private String direccionComprador;
    @XmlElement(required = true)
    private BigDecimal totalSinImpuestos;
    @XmlElement(required = true)
    private BigDecimal totalSubsidio;
    @XmlElement(required = true)
    private BigDecimal totalDescuento;
    @XmlElement(required = true)
    private TotalConImpuestos totalConImpuestos;
    private compensacion compensaciones;
    @XmlElement(required = true)
    private BigDecimal propina;
    @XmlElement(required = true)
    private BigDecimal importeTotal;
    private String moneda;
    private Pago pagos;


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"compensacion"})
    public static class compensacion {
        @XmlElement(required = true)
        private List<detalleCompensaciones> compensacion;


        public List<detalleCompensaciones> getCompensaciones() {
            if (this.compensacion == null) {
                this.compensacion = new ArrayList<detalleCompensaciones>();
            }
            return this.compensacion;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"codigo", "tarifa", "valor"})
        public static class detalleCompensaciones {
            @XmlElement(required = true)
            private int codigo;


            @XmlElement(required = true)
            private int tarifa;


            @XmlElement(required = true)
            private BigDecimal valor;


            public int getCodigo() {
                return this.codigo;
            }


            public void setCodigo(int value) {
                this.codigo = value;
            }


            public int getTarifa() {
                return this.tarifa;
            }


            public void setTarifa(int value) {
                this.tarifa = value;
            }


            public BigDecimal getValor() {
                return this.valor;
            }


            public void setValor(BigDecimal valor) {
                this.valor = valor;
            }
        }
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"pago"})
    public static class Pago {
        @XmlElement(required = true)
        private List<DetallePago> pago;


        public List<DetallePago> getPagos() {
            if (this.pago == null) {
                this.pago = new ArrayList<DetallePago>();
            }
            return this.pago;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"formaPago", "total", "plazo", "unidadTiempo"})
        public static class DetallePago {
            @XmlElement(required = true)
            private String formaPago;


            @XmlElement(required = true)
            private BigDecimal total;

            private String plazo;

            private String unidadTiempo;


            public String getFormaPago() {
                return this.formaPago;
            }

            public void setFormaPago(String formaPago) {
                this.formaPago = formaPago;
            }


            public BigDecimal getTotal() {
                return this.total;
            }

            public void setTotal(BigDecimal total) {
                this.total = total;
            }


            public String getPlazo() {
                return this.plazo;
            }

            public void setPlazo(String plazo) {
                this.plazo = plazo;
            }


            public String getUnidadTiempo() {
                return this.unidadTiempo;
            }

            public void setUnidadTiempo(String unidadTiempo) {
                this.unidadTiempo = unidadTiempo;
            }
        }
    }
}