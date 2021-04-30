package com.smile.invoice.model;


import com.smile.invoice.model.jaxb.JAXBContextFactura;
import lombok.Data;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import java.io.StringWriter;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"taxInfo", "invoiceInfo", "details", "infoAdicional"})
@XmlRootElement(name = "factura")
@Data
public class Invoice {

    @XmlElement(required = true, name = "infoTributaria")
    private TaxInfo taxInfo;
    @XmlElement(required = true)
    private InvoiceInfo invoiceInfo;
    @XmlElement(required = true)
    private Details details;
    private InfoAdicional infoAdicional;
    @XmlAttribute
    private String id;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    private String version;

    public String toXML() {
        try {
            StringWriter stringWriter = new StringWriter();
            Marshaller marshaller = JAXBContextFactura.initContext().createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(this, stringWriter);
            return stringWriter.toString();
        } catch (JAXBException e) {
            throw new IllegalStateException("Cant create invoice xml", e);
        }
    }

    public static final class Builder {

        private TaxInfo taxInfo;
        private InvoiceInfo invoiceInfo;
        private Details details;
        private InfoAdicional infoAdicional;
        private String id;
        private String version;

        private Builder() {
        }

        public static Builder newInvoice() {
            return new Builder();
        }

        public Builder withInfoTributaria(TaxInfo taxInfo) {
            this.taxInfo = taxInfo;
            return this;
        }

        public Builder withInfoFactura(InvoiceInfo invoiceInfo) {
            this.invoiceInfo = invoiceInfo;
            return this;
        }

        public Builder withDetalles(Details details) {
            this.details = details;
            return this;
        }

        public Builder withInfoAdicional(InfoAdicional infoAdicional) {
            this.infoAdicional = infoAdicional;
            return this;
        }

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }

        public Invoice build() {
            Invoice invoice = new Invoice();
            invoice.setTaxInfo(taxInfo);
            invoice.setInvoiceInfo(invoiceInfo);
            invoice.setDetails(details);
            invoice.setInfoAdicional(infoAdicional);
            invoice.setId(id);
            invoice.setVersion(version);
            return invoice;
        }
    }
}
