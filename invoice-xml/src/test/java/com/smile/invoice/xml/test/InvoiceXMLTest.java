package com.smile.invoice.xml.test;

import com.smile.invoice.model.Invoice;
import com.smile.invoice.model.TaxInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InvoiceXMLTest {

    @DisplayName("Factura to XML Test")
    @Test
    public void toXMLTest() {


        TaxInfo taxInfo = TaxInfo.Builder.newTaxInfo()
                .withAmbiente("1")
                .withTipoEmision("1")
                .withRazonSocial("Galindo Bucheli Eliana Alexandra")
                .withNombreComercial("Smile Viste a la Moda")
                .withRuc("1003423280001")
                .withCodDoc("01")
                .withEstab("002")
                .withPtoEmi("002")
                .withSecuencial(1)
                .withRuc("1003423280001")
                .withDirMatriz("Avenida Amazonas y Roca")
                .build();

        Invoice invoice = Invoice.Builder
                .newInvoice()
                .withInfoTributaria(taxInfo)
                .build();


        String xml = invoice.toXML();
        System.out.println(xml);

    }
}
