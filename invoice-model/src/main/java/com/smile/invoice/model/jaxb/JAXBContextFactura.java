package com.smile.invoice.model.jaxb;

import com.smile.invoice.model.Invoice;
import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

@Slf4j
public class JAXBContextFactura {

    private static JAXBContext instance;


    private JAXBContextFactura() {
    }

    public static synchronized JAXBContext initContext() {
        try {
            if (instance == null)
                instance = JAXBContext.newInstance(Invoice.class);
        } catch (JAXBException e) {
            log.error("Error instantiating Factura JAXB context");
        }
        return instance;
    }
}
