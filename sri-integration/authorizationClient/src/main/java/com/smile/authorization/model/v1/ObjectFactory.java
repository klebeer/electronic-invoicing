package com.smile.authorization.model.v1;


import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public AutorizacionComprobante createAutorizacionComprobante() {
        return new AutorizacionComprobante();
    }

    public AutorizacionComprobanteResponse createAutorizacionComprobanteResponse() {
        return new AutorizacionComprobanteResponse();
    }

    public RespuestaComprobante createRespuestaComprobante() {
        return new RespuestaComprobante();
    }

    public Autorizacion createAutorizacion() {
        return new Autorizacion();
    }

    public Mensaje createMensaje() {
        return new Mensaje();
    }

    public AutorizacionComprobanteLote createAutorizacionComprobanteLote() {
        return new AutorizacionComprobanteLote();
    }

    public AutorizacionComprobanteLoteResponse createAutorizacionComprobanteLoteResponse() {
        return new AutorizacionComprobanteLoteResponse();
    }

    public RespuestaLote createRespuestaLote() {
        return new RespuestaLote();
    }


}
