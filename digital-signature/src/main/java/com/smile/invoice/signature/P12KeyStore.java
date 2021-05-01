package com.smile.invoice.signature;

import com.google.common.collect.Iterators;
import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.Objects;

public class P12KeyStore {

    private String p12FilePath;
    private String password;

    public P12KeyStore(String p12FilePath, String password) {
        Objects.nonNull(p12FilePath);
        Objects.nonNull(password);
        this.p12FilePath = p12FilePath;
        this.password = password;
    }

    @SneakyThrows
    public X509Certificate x509Certificate() {
        KeyStore p12 = getKeyStore();
        String certAlias = getCertAlias(p12);
        return (X509Certificate) p12.getCertificate(certAlias);
    }

    @SneakyThrows
    public PrivateKey privateKey() {
        KeyStore p12 = getKeyStore();
        String certAlias = getCertAlias(p12);

        return (PrivateKey) p12.getKey(certAlias, password.toCharArray());
    }

    private String getCertAlias(KeyStore p12) throws KeyStoreException {
        Enumeration<String> aliases = p12.aliases();
        int aliasSize = Iterators.size(aliases.asIterator());
        if (aliasSize != 1) {
            throw new IllegalStateException("The P12 file needs just one alias");
        }
        String certAlias = p12.aliases().asIterator().next();
        return certAlias;
    }

    private KeyStore getKeyStore() throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException {
        KeyStore p12 = KeyStore.getInstance("pkcs12");
        p12.load(new FileInputStream(p12FilePath), password.toCharArray());
        return p12;
    }

}
