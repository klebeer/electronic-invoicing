package com.smile.invoice.signature.test;

import com.smile.invoice.signature.XAdES;
import es.mityc.firmaJava.libreria.utilidades.UtilidadTratarNodo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@Disabled
public class XAdESTest {

    @Test
    public void signFileTest() {
        XAdES xAdES = XAdES.Builder
                .aXAdES()
                .withP12FilePath("test.p12")
                .withPassword("pass")
                .withFileToSignPath("in.xml")
                .build();

        Document document = xAdES.signFile();
        try {
            FileOutputStream fos = new FileOutputStream("out.xml");
            UtilidadTratarNodo.saveDocumentToOutputStream(document, fos, true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
