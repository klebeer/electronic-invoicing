package com.smile.authorization.v1;

import com.smile.authorization.model.v1.AutorizacionComprobante;
import com.smile.authorization.model.v1.AutorizacionComprobanteLote;
import com.smile.authorization.model.v1.AutorizacionComprobanteLoteResponse;
import com.smile.authorization.model.v1.AutorizacionComprobanteResponse;
import feign.Headers;
import feign.RequestLine;

public interface AutorizacionComprobantesOffline {

    @RequestLine("POST")
    @Headers({

            "Content-Type: text/xml"
    })
    AutorizacionComprobanteResponse autorizacionComprobante(AutorizacionComprobante request);

    @RequestLine("POST")
    @Headers({

            "Content-Type: text/xml"
    })
    AutorizacionComprobanteLoteResponse autorizacionComprobanteLote(AutorizacionComprobanteLote request);

}
