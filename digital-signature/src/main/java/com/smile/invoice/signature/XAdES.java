package com.smile.invoice.signature;

import es.mityc.firmaJava.libreria.xades.DataToSign;
import es.mityc.firmaJava.libreria.xades.FirmaXML;
import es.mityc.firmaJava.libreria.xades.XAdESSchemas;
import es.mityc.javasign.EnumFormatoFirma;
import es.mityc.javasign.xml.refs.InternObjectToSign;
import es.mityc.javasign.xml.refs.ObjectToSign;
import lombok.Data;
import lombok.SneakyThrows;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.security.Security;

@Data
public class XAdES {

    private String p12FilePath;
    private String fileToSignPath;
    private String password;


    @SneakyThrows
    public Document signFile() {
        DataToSign datosAFirmar = createDataToSign();
        FirmaXML firma = new FirmaXML();
        P12KeyStore p12KeyStore = new P12KeyStore(p12FilePath, password);
        Object[] res = firma.signFile(p12KeyStore.x509Certificate(), datosAFirmar, p12KeyStore.privateKey(), Security.getProvider("SunRsaSign"));
        return (Document) res[0];
    }


    private DataToSign createDataToSign() {
        DataToSign datosAFirmar = new DataToSign();
        datosAFirmar.setXadesFormat(EnumFormatoFirma.XAdES_BES);
        datosAFirmar.setEsquema(XAdESSchemas.XAdES_132);
        datosAFirmar.setXMLEncoding("UTF-8");
        datosAFirmar.setEnveloped(true);
        datosAFirmar.addObject(new ObjectToSign(new InternObjectToSign("comprobante"), "contenido comprobante", null, "text/xml", null));
        datosAFirmar.setParentSignNode("comprobante");

        Document docToSign = getDocument(fileToSignPath);
        datosAFirmar.setDocument(docToSign);
        return datosAFirmar;
    }

    @SneakyThrows
    private Document getDocument(String filepath) {
        File file = new File(filepath);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.parse(file);
    }

    public static final class Builder {
        private String p12FilePath;
        private String password;
        private String fileToSignPath;

        private Builder() {
        }

        public static Builder aXAdES() {
            return new Builder();
        }

        public Builder withFileToSignPath(String fileToSignPath) {
            this.fileToSignPath = fileToSignPath;
            return this;
        }

        public Builder withP12FilePath(String p12FilePath) {
            this.p12FilePath = p12FilePath;
            return this;
        }


        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public XAdES build() {
            XAdES xAdES = new XAdES();
            xAdES.setP12FilePath(p12FilePath);
            xAdES.setPassword(password);
            xAdES.setFileToSignPath(fileToSignPath);
            return xAdES;
        }
    }
}


