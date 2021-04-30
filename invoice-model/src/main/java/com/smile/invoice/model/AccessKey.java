package com.smile.invoice.model;

import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;

@Setter
public class AccessKey {

    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("ddMMyyyy");

    private String stage;
    private String verificationNumber;
    private String numericCode;
    private String emissionType;
    private Date emissionDate;
    private String voucherType;
    private String ruc;
    private TaxInfo taxInfo;

    public String buildKey() {
        String generatedKey;
        int verificador = 0;


        if (ruc != null && ruc.length() < 13) {
            ruc = String.format("%013d", ruc);
        }


        String issueDate = SIMPLE_DATE_FORMAT.format(emissionDate);
        String serialNumber = taxInfo.getEstab().concat(taxInfo.getPtoEmi());

        StringBuilder clave = new StringBuilder(issueDate);
        clave.append(voucherType);
        clave.append(ruc);
        clave.append(stage);
        clave.append(serialNumber);
        clave.append(taxInfo.getSecuencial());
        clave.append("12345678");
        clave.append(taxInfo.getTipoEmision());


        verificador = generaDigitoModulo11(clave.toString());

        clave.append(Integer.valueOf(verificador));
        generatedKey = clave.toString();

        if (clave.toString().length() != 49) {
            generatedKey = null;
        }
        return generatedKey;
    }

    public int generaDigitoModulo11(String cadena) {
        int baseMultiplicador = 7;
        System.out.println("CADENA-->" + cadena);
        int[] aux = new int[cadena.length()];
        int multiplicador = 2;
        int total = 0;
        int verificador = 0;
        for (int i = aux.length - 1; i >= 0; i--) {
            aux[i] = Integer.parseInt("" + cadena.charAt(i));
            aux[i] = aux[i] * multiplicador;
            multiplicador++;
            if (multiplicador > baseMultiplicador) {
                multiplicador = 2;
            }
            total += aux[i];
        }

        if (total == 0 || total == 1) {
            verificador = 0;
        } else {
            verificador = (11 - total % 11 == 11) ? 0 : (11 - total % 11);
        }


        if (verificador == 10) {
            verificador = 1;
        }

        return verificador;
    }

    public static final class Builder {
        private AccessKey accessKey;

        private Builder() {
            accessKey = new AccessKey();
        }

        public static Builder anAccessKey() {
            return new Builder();
        }

        public Builder withStage(String stage) {
            accessKey.setStage(stage);
            return this;
        }

        public Builder withVerificationNumber(String verificationNumber) {
            accessKey.setVerificationNumber(verificationNumber);
            return this;
        }

        public Builder withNumericCode(String numericCode) {
            accessKey.setNumericCode(numericCode);
            return this;
        }

        public Builder withEmissionType(String emissionType) {
            accessKey.setEmissionType(emissionType);
            return this;
        }

        public Builder withEmissionDate(Date emissionDate) {
            accessKey.setEmissionDate(emissionDate);
            return this;
        }

        public Builder withVoucherType(String voucherType) {
            accessKey.setVoucherType(voucherType);
            return this;
        }

        public Builder withRuc(String ruc) {
            accessKey.setRuc(ruc);
            return this;
        }

        public Builder withTaxInfo(TaxInfo taxInfo) {
            accessKey.setTaxInfo(taxInfo);
            return this;
        }

        public AccessKey build() {
            return accessKey;
        }
    }
}
