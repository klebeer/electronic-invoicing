package com.smile.invoice.model;

import lombok.Data;

import java.util.Date;

@Data
public class ImpuestoValor {
    private String codigo;
    private Integer codigoImpuesto;
    private Double porcentaje;
    private Double porcentajeRentencion;
    private String tipoImpuesto;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer CodigoAdm;
    private String marcaPorcentajeLibre;
}
